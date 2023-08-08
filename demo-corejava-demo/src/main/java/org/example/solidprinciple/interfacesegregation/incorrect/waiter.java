package org.example.solidprinciple.interfacesegregation.incorrect;

public class waiter implements  RestaurantEmployee{
    @Override
    public void washDishes() {
        //not the waiter job
    }

    @Override
    public void serveCustomer() {
//yes this is the waiter job.he is here in restaorant to serve the customer // T
    }

    @Override
    public void cookFood() {
//not the waiter job.
    }
}
//here what is task of the waiter