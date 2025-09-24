package com.atlas;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

public class ObjectMatcherDemo {

    @Test
    public void method1() {

        Customer customer = new Customer("John", "Abraham");

        String expected = customer.toString();

        assertThat(customer, hasToString(expected));
    }
}
