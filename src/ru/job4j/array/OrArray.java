package ru.job4j.array;

import java.util.Arrays;

public class OrArray {

    public static boolean isFoundInArray(int[] array, int el) {
        for (int j : array) {
            if (j == el) {
                return true;
            }
        }

        return false;
    }

    public static int[] or(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int resIndex = 0;

        for (int j : left) {
            res[resIndex++] = j;
        }

        if (res.length > 0 && right.length > 0) {
            for (int j : right) {
                if (!isFoundInArray(res, j)) {
                    res[resIndex++] = j;
                }
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
