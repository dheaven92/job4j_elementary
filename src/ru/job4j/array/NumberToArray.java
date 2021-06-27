package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        String[] digits = String.valueOf(number).split("");
        int[] res = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            res[i] = Integer.parseInt(digits[digits.length - 1 - i]);
        }

        return res;
    }
}
