package org.example.designpattern.creational.factory;

public class CurrencyFactory {

    public  static currency createCurrency(String country)
    {
        if(country!=null && country.equalsIgnoreCase("India"))
        {
            return new IndianCurrency();
        } else if (country.equalsIgnoreCase("Singapor")) {
            return new SGDDoller();
        } else if (country.equalsIgnoreCase("USA")) {
            return new USDoller();

        }else
        {
            throw new IllegalArgumentException("no currency");
        }
    }
}
