package com.rootcodelabs.java;

import com.github.javafaker.Faker;

public class RandomDetails {
    Faker faker = new Faker();
    //TODO: Following will be executed only once for an instantiation. Your values will be same
   // String randomPhoneNumber = faker.phoneNumber().phoneNumber();
    //String randomAddress = faker.address().fullAddress();

    public String getRandomPhoneNumber() {
        String randomPhoneNumber = faker.phoneNumber().phoneNumber();
        return  randomPhoneNumber;
    }

    /**
     * Generate a random phone number with a given prefix
     * @param prefix of the phone number
     * @param length of the phone number
     * @return random phone number
     */
    public String getRandomPhoneNumber(String prefix, int length) {
        int lengthSuffix = length- prefix.trim().length();
        return String.format("%s%s", prefix, faker.number().digits(lengthSuffix));
    }


    public String getRandomAddress() {
        return faker.address().fullAddress();
    }


}
