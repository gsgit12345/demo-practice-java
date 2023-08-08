package org.example.solidprinciple.singleresponsibility.correctapproach.noncorrect;

public class Invoice {
    private TV tvItem;
    private int quantity;


    public Invoice(TV tvItem, int quantity) {
        this.tvItem = tvItem;
        this.quantity = quantity;
    }
public int  calculateTotalPrice()
{
    int  price=((tvItem.price) * this.quantity);
    return   price;
}

public  void  printInvoice()
{
    //printing invoice
}
public   void  saveToDb()
{
    //saving  data into db
}

}
//Note  :-- this class  is not following single responsibility  principle.because it is doing multiple  task like printinginvoice ,saving into db
//calcaulating  total price.so it 3 reason  to change the behaviour.but it should be one reason.