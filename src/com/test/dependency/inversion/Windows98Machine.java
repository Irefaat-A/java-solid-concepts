package com.test.dependency.inversion;

public class Windows98Machine {

    private Monitor monitor;
    private Keyboard keyboard;

    public Windows98Machine(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}
