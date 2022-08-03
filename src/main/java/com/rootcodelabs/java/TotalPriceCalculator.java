package com.rootcodelabs.java;

public class TotalPriceCalculator {

    /**
     * //TODO Add description (e.g Get the total price)
     *
     * @param price1
     * @param price2
     */

    //TODO: It's required to return the value than just displaying the value
//    public static void getTotal(String price1, String price2) {
//        double total =  Double.parseDouble(price1) + Double.parseDouble(price2);
//        System.out.println("Total is USD " + total);
//    }
    public static double getTotal(String price1, String price2) {
        double total = Double.parseDouble(price1) + Double.parseDouble(price2);
        return total;
    }

    public static void main(String[] args) {

        String price1 = "10.5";
        String price2 = "12.5";
        //TODO: Remove the commented line
        //getTotal(price1, price2);

        System.out.println("Total is USD " + getTotal(price1,price2));
    }
}
