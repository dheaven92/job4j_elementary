package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeRowsTest {

    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test2() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12, 13}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test3() {
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

}