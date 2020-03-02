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

public class BojackHorsemanTest extends AbstractFakerTest {


      @Test
      public void testSampleCharactersAndTongueTwisters(){
          HashMap<String, List<String>> mustHaves = new HashMap<String, List<String>>();

          // Add sample tests:
          mustHaves.put("characters", Arrays.asList("Joseph Sugarman", "Princess Carolyn"));
          mustHaves.put("tongue_twisters", Arrays.asList("Courtney Portnoy portrayed the formerly portly consort in the seaport resort", "Courtly roles like the formerly portly consort are Courtney Portnoy's forté", "That's sorta been thwarted unfortunately cos Courtney's purportedly falling short of shoring up fourth quadrant support"));
          
          for(String obj : mustHaves.keySet()){
              List<Object> bojackHorseman = (List<Object>) faker.fakeValuesService().fetchObject("bojack_horseman." + obj);

              // Assert that all sample cities are contained:
              assertTrue(bojackHorseman.containsAll(mustHaves.get(obj)));
          }
      }

    @Test
    public void testCharacters() {
        assertThat(faker.bojackHorseman().characters(), isStringWithContents());
    }

    @Test
    public void testTongueTwisters() {
        assertThat(faker.bojackHorseman().tongueTwisters(), isStringWithContents());
    }

}
