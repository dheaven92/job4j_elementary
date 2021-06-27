package ru.job4j.array;

public class Fibonacci {

    public static boolean checkArray(int[] data) {
        boolean rsl = true;

        for (int i = 0; i < data.length; i++) {
            if (i >= 2 && data[i] != data[i - 2] + data[i - 1]) {
                rsl = false;
            }
        }

        return rsl;
    }
}
