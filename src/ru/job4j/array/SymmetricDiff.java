package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {

    public static int[] concat(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int resIndex = 0;

        for (int j : left) {
            res[resIndex++] = j;
        }

        for (int j : right) {
            res[resIndex++] = j;
        }

        return Arrays.copyOf(res, resIndex);
    }

    public static boolean isFoundInArray(int[] array, int el) {
        for (int j : array) {
            if (j == el) {
                return true;
            }
        }

        return false;
    }

    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int resIndex = 0;
        int sum = 0;

        int[] union = concat(left, right);

        for (int el : union) {
            if (!isFoundInArray(res, el)) {
                sum = 0;

                if (isFoundInArray(left, el)) {
                    sum++;
                }

                if (isFoundInArray(right, el)) {
                    sum++;
                }

                if (sum == 1) {
                    res[resIndex++] = el;
                }
            }
        }

        return Arrays.copyOf(res, resIndex);
    }
}
