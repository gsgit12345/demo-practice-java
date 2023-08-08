package org.example.solidprinciple.singleresponsibility.openclosedprinciple.correct;

public class InvoicePrinter {
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice invoice;

    public void printInvoice()
    {
        
    }

}
