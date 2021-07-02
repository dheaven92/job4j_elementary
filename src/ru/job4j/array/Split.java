package ru.job4j.array;

import java.util.Arrays;

public class Split {

    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int resultIndex = 0;
        char[] word = new char[str.length];
        int wordIndex = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                word[wordIndex++] = str[i];
            } else {
                result[resultIndex++] = Arrays.copyOf(word, wordIndex);
                wordIndex = 0;
            }
        }

        result[resultIndex] = Arrays.copyOf(word, wordIndex);

        return Arrays.copyOf(result, resultIndex + 1);
    }
}
