package org.example.designpattern.creational.factory;

public class FactoryDesignTest {
    public static void main(String str[])
    {
       currency india= CurrencyFactory.createCurrency("India");
       System.out.println(india.getCurrencySymbol());
    }
}
