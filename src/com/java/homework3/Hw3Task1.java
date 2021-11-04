package com.java.homework3;

import java.util.Random;
import java.util.Scanner;

public class Hw3Task1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 000001; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i % 100000) / 10000;
            int number3 = (i % 10000) / 1000;
            int number4 = (i % 1000) / 100;
            int number5 = (i % 100) / 10;
            int number6 = i % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println("В одном рулоне:" + sum + " счастливых билетов.");
    }
}