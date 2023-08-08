package org.example.solid.liskosubsti;

public class Bycycle  implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
//implement
    }
}
