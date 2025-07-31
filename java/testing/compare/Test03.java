package compare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test03 {

    @Test
    public void testCompare_WhenFirstIsGreater() {
        Junit4Test obj = new Junit4Test();
        int value = obj.compare(20, 10);  // 20 > 10, so should return 1
        Assertions.assertEquals(1, value);
    }

    @Test
    public void testCompare_WhenFirstIsLessOrEqual() {
        Junit4Test obj = new Junit4Test();
        int value = obj.compare(5, 10);   // 5 < 10, so should return -1
        Assertions.assertEquals(-1, value);
    }
}
