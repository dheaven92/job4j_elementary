package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static boolean testExpectedAndOutValues(int expected, int out) {
        return expected == out;
    }

    public static void main(String[] args) {
        boolean isEuroPassed = testExpectedAndOutValues(2, rubleToEuro(140));
        System.out.println("140 rubles are 2. Test result : " + isEuroPassed);

        boolean isDollarPassed = testExpectedAndOutValues(2, rubleToDollar(140));
        System.out.println("140 rubles are 2. Test result : " + isDollarPassed);
    }
}
