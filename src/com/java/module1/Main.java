package com.java.module1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static Object UserInputService;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int mas = scanner.nextInt();
        final Random random = new Random();

        if (mas <= 10) {
            System.out.println("Пожалуйста введите размер массива от 10 и больше");
        } else {
            int[] array = new int[mas];
            for (mas = 0; mas < array.length; mas++) {
                array[mas] = random.nextInt();
                array[mas] = (int) (Math.random() * 201) - 100;
            }
            System.out.println(Arrays.toString(array));
        }

        int[] arr2 = new int[]{12, 123, 53, 21, 43, 23, 32, 50, 57, 59, 78, 93};
        System.out.println("Выберите способ сортировки: 1)Убывание 2)Возрастание");
        System.out.println("Введите цифру 1 или 2");


        int array = scanner.nextInt();
        System.out.println("1: Убывание");
        int[] sorted = IntStream.of(arr2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        System.out.println("В порядке убывания:");
        for (int ss : sorted) {
            System.out.print(ss + ", ");
        }
        System.out.println();

        int array1 = scanner.nextInt();
        System.out.println("2: Возрастание");
        int[] reversed = IntStream.range(0, sorted.length)
                .map(i -> sorted[sorted.length - i - 1])
                .toArray();
        System.out.println("В порядке возрастания: ");

        for (int ss1 : reversed) {
            System.out.print(ss1 + ", ");
        }
        class Cube {
            public void cube(int[] array) {
                for (int i = 0; i < array.length; i += 3) {
                    array[i] = array[i] * array[i] * array[i];
                    System.out.println(Arrays.toString(array));
                }
            }

        }
    }
}

