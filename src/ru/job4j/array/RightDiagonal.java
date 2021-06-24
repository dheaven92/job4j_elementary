package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] arr = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i][data.length - 1 - i];
        }

        return arr;
    }
}
