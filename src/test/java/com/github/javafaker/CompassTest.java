package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CompassTest extends AbstractFakerTest {

    @Test
    public void testDirection() {
        assertThat(faker.compass().direction(), matchesRegularExpression("[A-Za-z0-9]+"));
    }

    @Test
    public void testAbbreviation() {
        assertThat(faker.compass().abbreviation(), matchesRegularExpression("[A-Za-z0-9]+"));
    }

    @Test
    public void testAzimuth() {
        assertThat(faker.compass().azimuth(), matchesRegularExpression("[A-Za-z0-9]+"));
    }

}
