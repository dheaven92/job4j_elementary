package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapColsTest {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapCols.swap(data, 0, 2);
        int[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        assertArrayEquals(expected, data);
    }

    @Test
    public void test2() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        SwapCols.swap(data, 0, 2);
        int[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7},
                {12, 11, 10}
        };
        assertArrayEquals(expected, data);
    }

    @Test
    public void test3() {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        SwapCols.swap(data, 0, 2);
        int[][] expected = {
                {3, 2, 1, 4},
                {7, 6, 5, 8},
                {11, 10, 9, 12},
        };
        assertArrayEquals(expected, data);
    }

}