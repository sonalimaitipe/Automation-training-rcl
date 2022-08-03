package com.rootcodelabs.java;

public class TotalPriceCalculator {

    /**
     *
     * @param price1
     * @param price2
     */

    public static void getTotal(String price1, String price2) {
        double total =  Double.parseDouble(price1) + Double.parseDouble(price2);
        System.out.println("Total is USD " + total);
    }

    public static void main(String[] args) {

        String price1 = "10.5";
        String price2 = "12.5";

        getTotal(price1, price2);

    }
}
