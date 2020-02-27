package com.github.javafaker;

import com.github.javafaker.repeating.Repeat;
import org.junit.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CityTest extends AbstractFakerTest {

    @Test
    public void testName() {
        String name = faker.city().name("Sweden");

        assertThat(name, isStringWithContents());

    }

    @Test
    public void testCountryAndCityName() {
        String name = faker.city().countryAndCityName();

        assertThat(name, isStringWithContents());

    }



}
