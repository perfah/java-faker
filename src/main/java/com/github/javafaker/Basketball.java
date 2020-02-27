package com.github.javafaker;

public class Basketball {
    
    private final Faker faker;

    public Basketball(Faker faker) {
        this.faker = faker;
    }

    public String team() {
        return faker.fakeValuesService().resolve("basketball.teams", this, faker);
    }

    public String player() {
        return faker.fakeValuesService().resolve("basketball.players", this, faker);
    }

    public String coach() {
        return faker.fakeValuesService().resolve("basketball.coaches", this, faker);
    }

    public String position() {
        return faker.fakeValuesService().resolve("basketball.positions", this, faker);
    }
}