package com.test01;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {

        Result resobj = JUnitCore.runClasses(JunitTest.class);
        for (Failure fobj : resobj.getFailures()) {
            System.out.println(fobj.toString()); // Corrected
        }

        System.out.println(resobj.wasSuccessful()); // true if test passed
    }
}
