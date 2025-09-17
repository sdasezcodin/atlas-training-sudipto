package suitetags;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ FirstTest.class, SecondTest.class })
public class TestSuite {
    //just groups tests
}
