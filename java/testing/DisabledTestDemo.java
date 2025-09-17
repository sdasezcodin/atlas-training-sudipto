import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class DisabledTestDemo {

    @Test
    void activeTest() {
        System.out.println("This test runs normally.");
    }

    @Disabled("Feature not implemented yet")
    @Test
    void disabledTest() {
        System.out.println("This test is skipped.");
    }
}
