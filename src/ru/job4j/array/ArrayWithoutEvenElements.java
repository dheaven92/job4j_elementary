package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int[] res = new int[data.length];
        int resIndex = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                res[resIndex] = data[i];
                resIndex++;
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
