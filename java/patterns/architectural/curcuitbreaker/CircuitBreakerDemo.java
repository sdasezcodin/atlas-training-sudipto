package com.circuitbreaker;

public class CircuitBreakerDemo {
    public static void main(String[] args) throws InterruptedException {
        CircuitBreaker cb = new CircuitBreaker();
        Service service = new Service();

        for (int i = 0; i < 6; i++) {
            System.out.println(cb.call(service));
            Thread.sleep(1000);
        }

        // Wait for reset timeout
        Thread.sleep(6000);
        System.out.println(cb.call(service));
    }
}
