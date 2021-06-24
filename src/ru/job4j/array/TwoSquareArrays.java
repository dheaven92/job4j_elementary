package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] arrLeft = new int[left.length * left.length];
        int[] arrRight = new int[arrLeft.length];
        int[] arrRes = new int[arrLeft.length];

        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                arrLeft[index] = left[i][j];
                index++;
            }
            System.out.println();
        }

        index = 0;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < right[i].length; j++) {
                arrRight[index] = right[i][j];
                index++;
            }
            System.out.println();
        }

        for (int i = 0; i < arrRes.length; i++) {
            arrRes[i] = Math.max(arrLeft[i], arrRight[i]);
        }

        return arrRes;
    }
}
