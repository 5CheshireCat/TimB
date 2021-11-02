package com.java.homework1;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("Timur Basov");


        String name = new String("Timur");
        System.out.print("Длина строки \" Timur\" : ");
        System.out.println(name.length());
        int Timur = 5;
        if (Timur > 7) {
            System.out.println("Timur name length more than 7");
        } else System.out.println("Timur name length less than 7");


        int step = 0;
        int i = 5;
        for (int step0 = 5; i < 26; i = i + 2, step++) {
            System.out.print("Шаг: " + step + " Значение: ");
            System.out.println(i);
        }
    }
}
