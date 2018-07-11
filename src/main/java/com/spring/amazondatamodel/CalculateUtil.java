package com.spring.amazondatamodel;

public class CalculateUtil {

    public Double calculatePriceBeforeTax(Double price, Integer quantity) {

        return price * quantity;
    }

    public Double calculatePriceAfterTax(Double price, Double taxAmount) {

        return price * taxAmount;
    }
}
