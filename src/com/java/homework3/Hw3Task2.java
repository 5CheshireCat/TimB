package com.java.homework3;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Hw3Task2 {
    public static void main(String[] args) {
        {
            int num1;
            int num2;
            String operation;
            Scanner input = new Scanner(System.in);

            out.println("Введите первое число x:");
            num1 = input.nextInt();
            out.println("Введите второе число y:");
            num2 = input.nextInt();
            Scanner calc = new Scanner(System.in);
            out.println("Введите знак арифметической операции:");
            operation = calc.next();

            switch (operation) {
                case "+" -> out.println("Ответ z = " + (num1 + num2));
                case "-" -> out.println("Ответ z = " + (num1 - num2));
                case "*" -> out.println("Ответ z = " + (num1 * num2));
                case "/" -> out.println("Ответ z = " + (num1 / num2));
            }
            if ("/".equals(operation)) {
                if (num2 == 0) {
                    out.println("ОШИБКА: Y не должн быть = 0!");
                }
            }
        }

    }
}