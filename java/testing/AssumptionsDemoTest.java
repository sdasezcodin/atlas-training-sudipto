import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsDemoTest {

    @Test
    void testOnlyOnWindows() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"),
                "Test skipped: not running on Windows");

        // Test logic runs only if assumption passes
        System.out.println("Running test on Windows...");
    }
}
