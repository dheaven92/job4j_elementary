package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int length = (int) Math.round(Math.sqrt(array.length));
        int[][] res = new int[length][length];

        int k = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (k < array.length) {
                    res[i][j] = array[k];
                }
                k++;
            }
        }

        return res;
    }
}
