package compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareTest {

    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        return 0;
    }

    @Test
    public void testCompare_WhenFirstIsGreater() {
        int result = compare(10, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testCompare_WhenFirstIsSmaller() {
        int result = compare(3, 8);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testCompare_WhenEqual() {
        int result = compare(7, 7);
        Assertions.assertEquals(0, result);
    }
}
