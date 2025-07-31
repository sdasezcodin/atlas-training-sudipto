package tagtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TagTest {

    @Test
    @Tag("firstPriority")
    void testMethod01() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        assertEquals("hello", "he" + "llo");
    }

    @Test
    @Tag("fastTag")
    void testMethod03() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        assertEquals(true, 5 > 1);
    }
}
