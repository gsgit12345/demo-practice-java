package org.example.Collection.abstractionexample;

public class AbstractDemo {
    public static void main(String str[])
    {
        Currency inr=new IndianCurrency("INR");
        inr.setCountry("Indian");
        System.out.println(inr.getCountry());
    }

}
