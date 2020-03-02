package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static org.junit.Assert.assertThat;

public class BojackHorsemanTest extends AbstractFakerTest {

    @Test
    public void testCharacters() {
        assertThat(faker.bojackHorseman().characters(), isStringWithContents());
    }

    @Test
    public void testTongueTwisters() {
        assertThat(faker.bojackHorseman().tongueTwisters(), isStringWithContents());
    }

}
