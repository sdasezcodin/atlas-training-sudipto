package com.test03;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IgnoreTestDemo {

    @Test
    public void activeTest() {
        assertEquals(2, 1 + 1); // This will run
    }

    @Ignore("This test is temporarily ignored")
    @Test
    public void ignoredTest() {
        assertEquals(5, 2 + 3); // This will be ignored
    }
}
