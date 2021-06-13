package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int result = n;
        while (result - d >= 0) {
            result -= d;
        }
        return result;
    }
}
