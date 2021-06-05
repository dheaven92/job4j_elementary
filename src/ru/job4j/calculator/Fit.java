package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = manWeight(manHeight);
        System.out.println("Man " + manHeight + " is " + man);

        short womanHeight = 176;
        double woman = womanWeight(womanHeight);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}
