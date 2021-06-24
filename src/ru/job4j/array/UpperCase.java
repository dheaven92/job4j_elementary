package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {

    public static char[] toUpperCase(char[] string) {
        char[] upperString = Arrays.copyOf(string, string.length);

        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                upperString[i] = Character.toUpperCase(string[i]);
            }
        }

        return upperString;
    }
}
