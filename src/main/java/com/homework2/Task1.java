package com.homework2;

public class Task1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        int c = 32;
        System.out.printf("Площадь : %.2f",geroneSquare(12, 21, 32));
    }
    public static double geroneSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
