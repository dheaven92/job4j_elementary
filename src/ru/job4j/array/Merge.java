package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int rslIndex = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[rslIndex] = left[i];
                i++;
            } else {
                rsl[rslIndex] = right[j];
                j++;
            }
            rslIndex++;
        }

        if (i < left.length) {
            System.arraycopy(left, i, rsl, rslIndex, (left.length - i));
        }

        if (j < right.length) {
            System.arraycopy(right, j, rsl, rslIndex, (right.length - j));
        }

        return rsl;
    }
}
