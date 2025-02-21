package ru.job4j;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(10, 5, 0, 5);
        System.out.println("result (10, 5) to (0, 5) " + result2);

        double result3 = Point.distance(10, 0, 5, 5);
        System.out.println("result (10, 0) to (5, 5) " + result3);

        double result4 = Point.distance(-1, 0, 1, 5);
        System.out.println("result (-1, 0) to (1, 5) " + result4);
    }

}
