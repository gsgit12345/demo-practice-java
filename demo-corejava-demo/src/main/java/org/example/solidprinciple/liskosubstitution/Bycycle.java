package org.example.solidprinciple.liskosubstitution;

public class Bycycle  implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");//here we are narrowing the parent class feature
        //which should not be as per liskow substitution principle.
    }

    @Override
    public void accelerate() {
//implement
    }
}
