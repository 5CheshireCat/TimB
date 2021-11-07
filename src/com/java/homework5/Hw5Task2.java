package com.java.homework5;

import java.util.Arrays;
import java.util.Random;

public class Hw5Task2 {
    public static void main(String[] args) {
        int[] massive = new int[4];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(massive));

        boolean flag = false;
        for (int i = 1; i < massive.length; i++) {
            if (massive[i] <= massive[i - 1]) {
                flag = true;
                break;
            }
            if (flag) {
                System.out.println("Массив является строго возрастающей последовательностью!");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        }
    }
}
