package com.test04;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 1000) // 1000ms = 1 second
    public void testThatFailsDueToTimeout() throws InterruptedException {
        Thread.sleep(1500); // sleep for 1.5 seconds
        System.out.println("This won't complete in time");
    }

    @Test(timeout = 1000)
    public void testThatPassesWithinTime() throws InterruptedException {
        Thread.sleep(500); // sleep for 0.5 seconds
        System.out.println("Finished on time ⏱️");
    }
}
