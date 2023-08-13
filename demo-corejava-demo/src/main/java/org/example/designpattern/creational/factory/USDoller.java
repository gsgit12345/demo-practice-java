package org.example.designpattern.creational.factory;

public class USDoller implements currency{
    @Override
    public String getCurrencySymbol() {
        return "USD";
    }
}
