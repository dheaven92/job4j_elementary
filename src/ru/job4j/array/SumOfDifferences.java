package ru.job4j.array;

public class SumOfDifferences {

    public static int sum(int[] nums) {
        int sum = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (i >= 2) {
                sum += nums[i - 2] - nums[i - 1];
            }
        }

        return sum;
    }
}
