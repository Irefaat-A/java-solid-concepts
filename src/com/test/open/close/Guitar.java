package com.test.open.close;


public class Guitar {
    private String make;
    private String model;
    private String volume;

    public Guitar(String make, String model, String volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
