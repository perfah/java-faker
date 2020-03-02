package com.github.javafaker;

public class BojackHorseman {
    private final Faker faker;

    protected BojackHorseman(Faker faker) {
        this.faker = faker;
    }

    public String characters() {
        return faker.fakeValuesService().resolve("bojack_horseman.characters", this, faker);
    }

    public String tongueTwisters() {
        return faker.fakeValuesService().resolve("bojack_horseman.tongue_twisters", this, faker);
    }

}
