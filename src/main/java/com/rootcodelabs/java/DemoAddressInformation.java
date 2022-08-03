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
        System.out.println(rand.randomAddress);
        System.out.println(rand.randomPhoneNumber);
    }
}

