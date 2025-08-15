package com.circuitbreaker;

class CircuitBreaker {
    private enum State { CLOSED, OPEN, HALF_OPEN }
    private State state = State.CLOSED;
    private int failureCount = 0;
    private final int failureThreshold = 3;
    private long lastFailureTime = 0;
    private final long resetTimeout = 5000; // ms

    public String call(Service service) {
        long now = System.currentTimeMillis();

        switch (state) {
            case OPEN:
                if (now - lastFailureTime > resetTimeout) {
                    state = State.HALF_OPEN; // Try again after timeout
                } else {
                    return "Circuit is OPEN. Request blocked.";
                }
                break;

            case HALF_OPEN:
                // allow one test request
                try {
                    String response = service.request();
                    reset();
                    return "Half-Open: Success → " + response;
                } catch (Exception e) {
                    trip();
                    return "Half-Open: Failed → Back to OPEN.";
                }
        }

        // CLOSED state or HALF-OPEN success attempt
        try {
            String response = service.request();
            reset();
            return response;
        } catch (Exception e) {
            recordFailure();
            return "Request failed: " + e.getMessage();
        }
    }

    private void recordFailure() {
        failureCount++;
        lastFailureTime = System.currentTimeMillis();
        if (failureCount >= failureThreshold) {
            trip();
        }
    }

    private void trip() {
        state = State.OPEN;
        lastFailureTime = System.currentTimeMillis();
    }

    private void reset() {
        failureCount = 0;
        state = State.CLOSED;
    }
}
