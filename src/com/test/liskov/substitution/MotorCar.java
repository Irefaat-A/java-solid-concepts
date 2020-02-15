package com.test.liskov.substitution;

public class MotorCar implements Car {

    private Engine engine;

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.power(1000l);
    }
}
