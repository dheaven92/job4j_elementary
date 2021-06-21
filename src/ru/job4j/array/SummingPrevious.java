package ru.job4j.array;

public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int[] arr = new int[n];
        arr[0] = a;
        arr[1] = b;

        for (int i = 2; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            arr[i] = sum;
        }

        return arr;
    }
}
