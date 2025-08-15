package com.circuitbreaker;

class Service {
    private int failCount = 0;

    public String request() throws Exception {
        failCount++;
        if (failCount <= 2) { // fail first 2 times
            throw new Exception("Service Unavailable");
        }
        return "Service Response OK";
    }
}
