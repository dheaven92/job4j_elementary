package ru.job4j.array;

public class MergeRows {

    public static int[] merge(int[][] data) {
        int length = 0;

        for (int i = 0; i < data.length; i++) {
            length += data[i].length;
        }

        int[] arr = new int[length];
        int index = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " (" + index + ") ");
                arr[index] = data[i][j];
                index++;
            }
            System.out.println();
        }

        return arr;
    }
}
