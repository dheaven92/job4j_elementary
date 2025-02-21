package ru.job4j.array;

public class NoConsecutive {

    public static int find(int[] data) {
        int result = -1;

        for (int i = 0; i < data.length - 1; i++) {
            if (Math.abs(data[i] - data[i + 1]) != 1) {
                return data[i + 1];
            }
        }

        return result;
    }
}
