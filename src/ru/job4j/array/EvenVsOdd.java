package ru.job4j.array;

public class EvenVsOdd {

    public static int whoWin(int[] players) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else {
                sum2 += players[i];
            }
        }

        if (sum1 > sum2) {
            return 1;
        } else if (sum2 > sum1) {
            return 2;
        } else {
            return 0;
        }
    }
}
