package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            boolean tmp = data[0];
            if (datum != tmp) {
                result = false;
                break;
            }
        }
        return result;
    }
}
