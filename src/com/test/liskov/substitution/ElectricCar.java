package com.test.liskov.substitution;

//violating liskov substitution, this class cant be replace by class A because certain behaviour does not apply in this class.
public class ElectricCar implements Car {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("I dont have a engine!");
    }

    @Override
    public void accelerate() {
        //insane acceleration!!!
    }
}
