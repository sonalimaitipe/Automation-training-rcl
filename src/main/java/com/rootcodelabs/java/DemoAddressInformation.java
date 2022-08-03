package com.rootcodelabs.java;

public class DemoAddressInformation {

    public static void main(String[] args) {
        AddressInformation address1 = new AddressInformation("12", "ABC Street", "Galle");
        System.out.println(address1.getAddress());

        AddressInformation address2 = new AddressInformation();
        address2.setCity("Colombo");
        address2.setHouseNumber("11A");
        address2.setStreetName("PQR");
        System.out.println(address2.getAddress());

        RandomDetails rand = new RandomDetails();
        //TODO: Never expose the variables outside the classes. Use getters if you really need them
//        System.out.println(rand.randomAddress);
//        System.out.println(rand.randomPhoneNumber);
        System.out.println(rand.getRandomAddress());
        System.out.println(rand.getRandomPhoneNumber());
        System.out.println(rand.getRandomPhoneNumber("071",10));

    }
}

