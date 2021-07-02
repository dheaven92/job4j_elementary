package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int last = nums[nums.length - 1];
        int prev = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length) {
                nums[0] = last;
                break;
            }

            int tmp = nums[i];
            nums[i] = prev;
            prev = tmp;
        }
    }
}
