package com.java.homework2;

public class Task2 {
    public static void main(String[] args) {
        int min_number = 1;
        int max_number = 100;

        int random_number1 = min_number + (int) (Math.random() * max_number);
        System.out.println("1-ое случайное число:" + random_number1);

        int random_number2 = min_number + (int) (Math.random() * max_number);
        System.out.println("2-ое случайное число:" + random_number2);

        int random_number3 = min_number + (int) (Math.random() * max_number);
        System.out.println("3-е случайное число:" + random_number3);

        if (random_number1 < random_number2 && random_number1 < random_number3) {
            System.out.println(random_number1);
        } else if (random_number2 < random_number1 && random_number2 < random_number3) {
            System.out.println(random_number2);
        } else if (random_number3 < random_number1 && random_number3 < random_number2) {
            System.out.println(random_number3);
        }
        int a = random_number1;
        int b = random_number2;
        int c = random_number3;
        if (a < b && a < c) {
            System.out.println("a is minimal number");
        }
        if (b < a && b < c) {
            System.out.println("b is minimal number");
        }
        if (c < a && c < b) {
            System.out.println("c is minimal number");
        }
    }
}
