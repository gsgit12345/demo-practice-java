package org.example.solid.singleres.openclosed;

public class InvoiceDAO {

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice invoice;
    public void saveToDB()
    {

    }
    public void saveToFile()
    {
        //this is a incorred as per open/closed principle
    }
}
