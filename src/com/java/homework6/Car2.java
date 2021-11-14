package com.java.homework6;

public class Car2 {
    private String manufacturer;
    private String engine;
    private Colour colour;
    private String petrol;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "manufacturer = USA" +
                ", engine = 3.2" +
                ", colour = GREEN" +
                ", petrol = A-98" +
                '}';
    }
}
