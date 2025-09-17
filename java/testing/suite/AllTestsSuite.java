package suitetags;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ FastTests.class, SlowTests.class })
public class AllTestsSuite {
    // Empty class to run both fast and slow tagged tests
}
