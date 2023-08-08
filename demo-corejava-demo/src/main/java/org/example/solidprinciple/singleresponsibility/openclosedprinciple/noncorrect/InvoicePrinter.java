package org.example.solidprinciple.singleresponsibility.openclosedprinciple.noncorrect;

public class InvoicePrinter {
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice invoice;

    public void printInvoice()
    {
        
    }

}
