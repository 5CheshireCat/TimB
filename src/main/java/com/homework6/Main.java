package com.homework6;

public class Main {
    private static boolean isEnoughPetrolLevel;

    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();
        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Car1: Engine started!");
        System.out.println(isEnoughPetrolLevel);
    }
}