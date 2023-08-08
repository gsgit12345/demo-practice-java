package org.example.solidprinciple.singleresponsibility.correctapproach;

public class InvoiceDAO {

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice invoice;
    public void saveToDB()
    {

    }
}
