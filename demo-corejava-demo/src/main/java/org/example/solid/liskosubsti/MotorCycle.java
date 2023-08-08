package org.example.solid.liskosubsti;

public class MotorCycle implements  Bike{

    boolean isEngionOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngionOn=true;
    }

    @Override
    public void accelerate() {
speed=speed+30;
    }
}
