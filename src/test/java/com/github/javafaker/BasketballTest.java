package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static org.junit.Assert.assertThat;

public class BasketballTest extends AbstractFakerTest {

    @Test
    public void testTeam() {
        assertThat(faker.basketball().team(), isStringWithContents());
    }

    @Test
    public void testPlayer() {
        assertThat(faker.basketball().player(), isStringWithContents());
    }

    @Test
    public void testCoach() {
        assertThat(faker.basketball().coach(), isStringWithContents());
    }

    @Test
    public void testPosition() {
        assertThat(faker.basketball().position(), isStringWithContents());
    }


}
