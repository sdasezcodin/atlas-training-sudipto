package com.test02;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest02 {

    String msg = "running test02";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside msgTest() - Test 02");
        Assert.assertEquals(msg, msgUtilobj.printMessage());
    }

    @Test
    public void anotherTest() {
        System.out.println("Inside anotherTest() - Test 02");
        assertEquals("Hello", "Hello");
    }
}
