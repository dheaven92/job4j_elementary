package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int resIndex = 0;

        if (left.length > 0) {
            for (int j : left) {
                if (right.length == 0) {
                    res[resIndex++] = j;
                } else {
                    for (int k : right) {
                        if (j != k) {
                            res[resIndex++] = j;
                            break;
                        }
                    }
                }
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
