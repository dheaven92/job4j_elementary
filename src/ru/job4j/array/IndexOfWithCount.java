package ru.job4j.array;

public class IndexOfWithCount {

    public static int indexOf(char[] string, char c, int number) {
        int res = -1;
        int count = 0;

        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count++;
                if (count == number) {
                    return i;
                }
            }
        }

        return res;
    }
}
