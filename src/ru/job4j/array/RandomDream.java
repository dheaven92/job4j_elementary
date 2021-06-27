package ru.job4j.array;

public class RandomDream {

    public static String random(String[] prizes, int num) {
        String res = "";

        for (int i = 0; i < prizes.length; i++) {
            int n = num % prizes.length;

            if (n == 0) {
                n = prizes.length;
            }

            if (i + 1 == n) {
                res = prizes[i];
            }
        }

        return res;
    }
}
