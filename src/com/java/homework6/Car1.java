package com.java.homework6;

public class Car1 {
    public static startEngine startEngine;
    private String manufacturer;
    private String engine;
    private Colour colour;
    private String petrol;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = "Germany";
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = "3.0";
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = Colour.ORANGE;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = "A-95";
    }

    @Override
    public String toString() {
        return "Car1{" +
                "manufacturer = Germany" +
                ", engine = 3.0" +
                ", colour = ORANGE" +
                ", petrol = A-95" +
                '}';
    }
}
