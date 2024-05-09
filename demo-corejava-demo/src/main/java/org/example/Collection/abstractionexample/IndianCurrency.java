package org.example.Collection.abstractionexample;

public class IndianCurrency  extends Currency{
    String name;
    public IndianCurrency(String name)
    {
        super(name);
    }
    @Override
    public void rate() {
        System.out.println(getName() + " INdian");

    }
}
