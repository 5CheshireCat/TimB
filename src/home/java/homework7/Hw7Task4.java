package homework7;

import java.util.Scanner;

public class Hw7Task4 {
    private static String numberDigits;

    public static void main(String[] args) {
        System.out.println(findCount(123));
        System.out.println("Ноль получится через 13 действий.");
    }

    private static int findCount(int number) {
        int eventCounter = 0;

        while (number > 0) {
            int digitsSum = findDigitsSum(number);
            number -= digitsSum;
            eventCounter++;
        }

        return eventCounter;
    }

    private static int findDigitsSum(int number) {
        int digitsSum = 0;
        int[] digits = getNumberDigits(number);

        for (int i = 0; i < digits.length; i++) {
            digitsSum += digits[i];
        }

        return digitsSum;
    }

    private static int findNumberLength(int number) {
        int numberLength = 0;

        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }

    private static int[] getNumberDigits(int number) {
        int numberLength = findNumberLength(number);
        int[] numberDigits = new int[numberLength];

        for (int i = 1; i <= numberLength; i++) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;
            numberDigits[numberLength - i] = digit;
        }

        return numberDigits;
    }

}
