package com.test05;

import org.junit.Test;

public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        int result = 10 / 0; // 💥 ArithmeticException will be thrown
    }

    @Test
    public void testNormalDivision() {
        int result = 10 / 2;
        System.out.println("Result: " + result);
    }
}
