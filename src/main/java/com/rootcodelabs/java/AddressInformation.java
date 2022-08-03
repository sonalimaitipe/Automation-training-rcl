package com.rootcodelabs.java;

public class AddressInformation {
    private String houseNumber;
    private String streetName;
    private String city;

    public AddressInformation() {

    }

    public AddressInformation(String houseNumber, String streetName, String city) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        //TODO: You can use text blocks for clearer formatting
        //return  houseNumber + ",\n" + streetName  + ",\n" + city  ;
        return String.format("""
                %s
                %s
                %s
                """, houseNumber,streetName,city);

    }

}




