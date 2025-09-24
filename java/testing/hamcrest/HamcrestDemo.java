package com.atlas;  

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class HamcrestDemo {

    @Test
    public void hamcrestMethod() {
        String str1 = "Apple";
        String str2 = "apple";

        assertThat(str1, equalToIgnoringCase(str2));
    }
}
