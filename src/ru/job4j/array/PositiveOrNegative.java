package ru.job4j.array;

public class PositiveOrNegative {

    public static boolean check(int[] data) {
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                count++;
            }
        }

        return count % 2 != 0;
    }
}
