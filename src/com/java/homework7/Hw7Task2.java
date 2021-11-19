package com.java.homework7;

import java.util.Arrays;
import java.util.Random;

public class Hw7Task2 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        generator(mas);
        printer(mas);
        Arrays.sort(mas);
        printer(mas);
    }

    private static void sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j]) {
                    int tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    private static void generator(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(6) - 3;
        }
    }

    private static void printer(int[] mas) {
        String res = "";
        for (int i : mas) {
            res += i + " ";
        }
        System.out.println(res);
    }
}

