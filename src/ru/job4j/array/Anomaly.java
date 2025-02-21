package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {

    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                int[] seq = new int[2];
                seq[0] = i;

                while (data[i] <= down || data[i] >= up) {
                    seq[1] = i++;
                    if (i >= data.length) {
                        break;
                    }
                }

                result[count++] = seq;
            }
        }

        return Arrays.copyOf(result, count);
    }
}
