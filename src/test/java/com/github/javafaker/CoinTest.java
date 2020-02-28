package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static org.junit.Assert.assertThat;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void testFlip() {
        assertThat(faker.coin().flip(), isStringWithContents());
    }

}