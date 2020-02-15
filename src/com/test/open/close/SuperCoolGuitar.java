package com.test.open.close;

//Open to extension
public class SuperCoolGuitar extends Guitar {

    private String colour;

    public SuperCoolGuitar(String make, String model, String volume, String colour) {
        super(make, model, volume);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
