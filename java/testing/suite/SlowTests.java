package suitetags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("slow")
public class SlowTests {

    @Test
    void slowTestMethod() throws InterruptedException {
        System.out.println("Running SLOW test... simulating long task");
        Thread.sleep(3000);  // Simulate slow test
        assertEquals(5, 2 + 3);
    }
}
