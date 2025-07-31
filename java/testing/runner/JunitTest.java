package com.test01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void testSubtract() {
        int num1 = 10;
        int num2 = 5;
        int res = num1 - num2;
        assertEquals(5, res);
    }
}
