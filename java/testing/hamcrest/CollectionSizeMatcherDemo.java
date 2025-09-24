package com.atlas;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.util.Arrays;
import java.util.List;

public class CollectionSizeMatcherDemo {

    @Test
    public void method2() {

        List<String> custList = Arrays.asList("john", "Mary", "Sheik", "Singh", "Sri");

        assertThat(custList, hasSize(5));
    }
}
