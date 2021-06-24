package ru.job4j.array;

public class SwapCols {

    public static void swap(int[][] data, int src, int dst) {
        for (int j = 0; j < data.length; j++) {
            int tmp = data[j][src];
            data[j][src] = data[j][dst];
            data[j][dst] = tmp;
        }
    }
}
