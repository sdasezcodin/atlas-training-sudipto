package com.atlas;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class BeanPropertyCheckDemo {

    @Test
    public void check() {
        Customer customer = new Customer("John", "Abraham");

        // Check if the bean has the property 'fname'
        assertThat(customer, hasProperty("fname"));
    }
}
