package org.example.solidprinciple.singleresponsibility.openclosedprinciple.noncorrect;

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
