package org.example.designpattern.creational.factory;

public class IndianCurrency implements currency {
    @Override
    public String getCurrencySymbol() {
        return "Rs";
    }
}
