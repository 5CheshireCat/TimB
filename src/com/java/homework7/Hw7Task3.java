package com.java.homework7;

public class Hw7Task3 {
    public static void main(String[] args) {

        int n = 9;
        int sum = 0;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
            if (i % 2 != 0) sum += f;
        }
        System.out.println(sum);
    }
}
