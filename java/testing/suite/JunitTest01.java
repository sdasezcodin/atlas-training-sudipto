package com.test02;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest01 {

    String msg = "running test01";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test
    public void msgTest() {
        System.out.println("Inside msgTest() - Test 01");
        Assert.assertEquals(msg, msgUtilobj.printMessage());
    }
}
