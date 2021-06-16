package ru.job4j.array;

public class TriangleMatrix {

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int k = 0;

        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                k++;
                triangle[i][j] = k;
            }
        }
        
        return triangle;
    }
}
