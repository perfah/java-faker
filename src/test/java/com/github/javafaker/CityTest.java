package com.github.javafaker;

import com.github.javafaker.repeating.Repeat;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CityTest extends AbstractFakerTest {

    @Test
    public void testSample(){
        HashMap<String, List<String>> mustHaves = new HashMap<String, List<String>>();

        // Add sample tests:
        mustHaves.put("United States of America", Arrays.asList("New York", "Los Angeles", "Chicago"));
        mustHaves.put("Sweden", Arrays.asList("Stockholm", "Uppsala", "Gothenburg", "Hudiksvall"));
        mustHaves.put("South Africa", Arrays.asList("Johannesburg", "Cape Town", "Durban"));

        for(String country : mustHaves.keySet()){
            List<Object> cities = (List<Object>) faker.fakeValuesService().fetchObject("city." + country);

            // Assert that all sample cities are contained:
            assertTrue(cities.containsAll(mustHaves.get(country)));
        }
    }

    @Test
    public void testName() {
        String country = "Sweden";
        String name = faker.city().name(country);

        assertThat(name, isStringWithContents());
    }

    @Test
    public void testCountryAndCityName() {
        String name = faker.city().countryAndCityName();

        assertThat(name, isStringWithContents());

    }



}
