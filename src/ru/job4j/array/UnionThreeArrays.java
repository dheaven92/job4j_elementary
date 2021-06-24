package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int length1 = 2;
        int length2 = middle.length - middle.length / 2 - 1;
        int length3 = length2 + 1;
        int[] arr = new int[length1 + length2 + length3];

        arr[0] = left[0];
        arr[arr.length - 1] = left[left.length - 1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (i % 2 != 0) {
                arr[i] = right[i - 1];
            } else {
                arr[i] = middle[i - 1];
            }
        }

        return arr;
    }
}
