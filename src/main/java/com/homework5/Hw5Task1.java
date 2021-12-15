package com.homework5;

import java.util.Arrays;

public class Hw5Task1 {
    public static void main(String[] args) {
        int[] massive = new int[8];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 10) + 1;
        }
        
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length; i++) {
            if (i % 2 == 1) {
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));

    }
}
