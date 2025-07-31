package demotest;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Test01 {
    String message = "hello all How are you";

    @Test
    void testMsg() {
        System.out.println("asserting the Test case ");
        assertEquals("hello all How are you", message);
    }
}
