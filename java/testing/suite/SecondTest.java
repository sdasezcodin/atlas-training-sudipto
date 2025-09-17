package suitetags;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTest {
    @Test
    void sampleTestTwo() {
        assertEquals("hello".toUpperCase(), "HELLO");
    }
}
