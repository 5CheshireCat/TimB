package homework7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Hw7Task1 {
    public static void main(String[] args) {
        int[] massive = {12, 5, 7, 0, 3, 2, 1, 0, 32, 35, 39, 0};
        System.out.println(Arrays.toString(massive));

        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 0) {
                counter++;
                System.out.println(counter);
            }
        }
        int j = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i]!=0) {
                j++;
            }
        }

        final int[] sorted = new int[j];
        j = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]!=0) {
                sorted[j] = massive[i];
                j++;
                System.out.println(Arrays.toString(sorted));
            }
        }
    }
}