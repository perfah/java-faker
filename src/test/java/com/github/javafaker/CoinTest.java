package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void testFlip() {
        boolean valid;
        String result;

        for (int i = 0; i < 1000; i++) {
            result = faker.coin().flip();
            valid = result.equals("Heads") || result.equals("Tails");
            assertTrue(valid);
        }
        
    }

}