package com.test02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitTest01.class,
        JunitTest02.class,
        JunitTest03.class
})
public class TestSuitDemo {
    // This runs all 3 test classes.
}
