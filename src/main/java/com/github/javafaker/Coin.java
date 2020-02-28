package com.github.javafaker;

public class Coin {

    private final Faker faker;

    protected Coin(Faker faker) {
        this.faker = faker;
    }

    public String flip() {
        return faker.fakeValuesService().resolve("coin.flip", this, faker);
    }
} 