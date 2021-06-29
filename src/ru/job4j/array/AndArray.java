package ru.job4j.array;

import java.util.Arrays;

public class AndArray {

    public static int[] and(int[] left, int[] right) {
        int[] res = new int[Math.max(left.length, right.length)];
        int resIndex = 0;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    res[resIndex] = left[i];
                    resIndex++;
                    break;
                }
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
