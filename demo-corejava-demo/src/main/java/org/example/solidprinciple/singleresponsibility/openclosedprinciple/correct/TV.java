package org.example.solidprinciple.singleresponsibility.openclosedprinciple.correct;

public class TV {
    String companyName;
    String productionYear;

    public TV(String companyName, String productionYear, int price) {
        this.companyName = companyName;
        this.productionYear = productionYear;
        this.price = price;
    }

    public int price;
}
