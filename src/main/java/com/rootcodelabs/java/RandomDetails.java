package com.rootcodelabs.java;

import com.github.javafaker.Faker;

public class RandomDetails {
    Faker faker = new Faker();
    String randomPhoneNumber = faker.phoneNumber().phoneNumber();
    String randomAddress = faker.address().fullAddress();

    public String getRandomPhoneNumber() {
        return  randomPhoneNumber;
    }

    public String getRandomAddress() {
        return randomAddress;
    }


}
