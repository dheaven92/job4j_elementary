package ru.job4j.array;

public class SubtractMinMax {

    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }

            if (ints[i] > max) {
                max = ints[i];
            }
        }

        return max - min;
    }
}
