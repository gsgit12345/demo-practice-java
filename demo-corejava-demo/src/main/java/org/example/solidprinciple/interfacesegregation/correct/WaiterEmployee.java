package org.example.solidprinciple.interfacesegregation.correct;

public class WaiterEmployee implements WaiterInterface{
    @Override
    public void serveCustomer() {
        //waiter task
    }

    @Override
    public void takeOrder() {
//waiter task
    }
}
