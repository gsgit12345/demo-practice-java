package org.example.Collection.abstractionexample;

public abstract class Currency {
    private String name;
    private String rate;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public Currency(String name) { this.name = name; }

    public abstract void rate();

    public String getName() { return name; }

}
