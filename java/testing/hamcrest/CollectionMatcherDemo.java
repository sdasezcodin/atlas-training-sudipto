package com.atlas;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import java.util.ArrayList;
import java.util.List;

public class CollectionMatcherDemo {

    @Test
    public void method1() {
        List<String> custList = new ArrayList<>();

        assertThat(custList, empty());
    }
}
