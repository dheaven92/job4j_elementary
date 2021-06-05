package ru.job4j.calculator;

public class SqArea {

    public static double square(int p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;

        return height * length;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
