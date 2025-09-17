import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEqualityTest {

    @Test
    public void testStringsAreEqual() {
        String actual = "hello world";
        String expected = "hello world";

        // Assertion to check if strings are equal
        assertEquals(expected, actual, "Strings should be equal");
    }
}
