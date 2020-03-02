package com.github.javafaker;

public class Compass {
    private final Faker faker;

    protected Compass(Faker faker) {
        this.faker = faker;
    }

    public String cardinalWord() {
        return faker.fakeValuesService().resolve("city.cardinal.word", this, faker);
    }

    public String cardinalAbbreviation() {
        return faker.fakeValuesService().resolve("city.cardinal.abbreviation", this, faker);
    }

    public String cardinalAzimuth() {
        return faker.fakeValuesService().resolve("city.cardinal.azimuth", this, faker);
    }

    public String ordinalWord() {
        return faker.fakeValuesService().resolve("city.ordinal.word", this, faker);
    }

    public String cardinalAbbreviation() {
        return faker.fakeValuesService().resolve("city.ordinal.abbreviation", this, faker);
    }

    public String ordinalAzimuth() {
        return faker.fakeValuesService().resolve("city.ordinal.azimuth", this, faker);
    }

    public String halfwindWord() {
        return faker.fakeValuesService().resolve("city.half-wind.word", this, faker);
    }

    public String halfwindAbbreviation() {
        return faker.fakeValuesService().resolve("city.half-wind.abbreviation", this, faker);
    }

    public String halfwindAzimuth() {
        return faker.fakeValuesService().resolve("city.half-wind.azimuth", this, faker);
    }

    public String quarterwindWord() {
        return faker.fakeValuesService().resolve("city.quarter-wind.word", this, faker);
    }

    public String quarterwindAbbreviation() {
        return faker.fakeValuesService().resolve("city.quarter-wind.abbreviation", this, faker);
    }

    public String quarterwindAzimuth() {
        return faker.fakeValuesService().resolve("city.quarter-wind.azimuth", this, faker);
    }

    public String direction() {
        return faker.fakeValuesService().resolve("city.direction", this, faker);
    }

    public String abbreviation() {
        return faker.fakeValuesService().resolve("city.abbreviation", this, faker);
    }

    public String azimuth() {
        return faker.fakeValuesService().resolve("city.azimuth", this, faker);
    }

}
