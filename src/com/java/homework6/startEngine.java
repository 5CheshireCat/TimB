package com.java.homework6;

public class startEngine {
    private boolean isRunning;

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public static void main(String[] args) {
        Car1.startEngine.start();
    }

    public boolean isEnoughPetrolLevel() {
        boolean PetrolLevel = true;
        int isEnoughPetrolLevel = 100;

        if (isEnoughPetrolLevel > 50) {
            PetrolLevel = true;
        }
        if (isEnoughPetrolLevel < 50) {
            PetrolLevel = false;
        }
        return PetrolLevel;
    }
}
