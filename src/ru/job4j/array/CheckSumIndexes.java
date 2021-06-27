package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {

        int[] res = new int[data.length * data.length];
        int resIndex = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    res[resIndex] = data[i][j];
                    resIndex++;
                }
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
