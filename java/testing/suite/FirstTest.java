package suitetags;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstTest {
    @Test
    void sampleTestOne() {
        assertTrue(2 + 2 == 4, "Math still works!");
    }
}
