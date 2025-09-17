package suitetags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fast")
public class FastTests {

    @Test
    void fastTestMethod() {
        System.out.println("Running FAST test");
        assertTrue(1 + 1 == 2);
    }
}
