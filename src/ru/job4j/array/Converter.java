package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {

        int length = 0;

        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }

        int size = 0;

        while (size * size < length) {
            size++;
        }

        int[][] res = new int[size][size];

        int row = 0;
        int cell = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res[row][cell] = array[i][j];
                cell++;

                if (cell == size) {
                    cell = 0;
                    row++;
                }
            }
        }
        
        return res;
    }
}
