package com.test02;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest03 {

    String msg = "running test03";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside msgTest() - Test 03");
        Assert.assertEquals(msg, msgUtilobj.printMessage());
    }
}
