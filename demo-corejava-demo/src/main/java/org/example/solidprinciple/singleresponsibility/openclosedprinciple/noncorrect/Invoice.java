package org.example.solidprinciple.singleresponsibility.openclosedprinciple.noncorrect;

public class Invoice {

    private TV tvItem;
    public  int quantity;


    public Invoice(TV tvItem, int quantity) {
        this.tvItem = tvItem;
        this.quantity = quantity;
    }
    public int  calculateTotalPrice()
    {
        int  price=((tvItem.price) * this.quantity);
        return   price;
    }
}
