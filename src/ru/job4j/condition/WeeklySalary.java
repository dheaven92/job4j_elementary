package ru.job4j.condition;

public class WeeklySalary {

    private static final int BASE_RATE = 10;
    private static final int BONUS_RATE = 15;

    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 5; i++) {
            salary += calculateDaySalary(hours[i], BASE_RATE, BONUS_RATE);
        }
        for (int i = 5; i < 7; i++) {
            salary += calculateDaySalary(hours[i], BASE_RATE * 2, BONUS_RATE * 2);
        }
        return salary;
    }

    private static int calculateDaySalary(int hours, int baseRate, int bonusRate) {
        int salary = 0;
        if (hours <= 8) {
            salary += hours * baseRate;
        }
        if (hours > 8) {
            int bonusHours = hours - 8;
            int baseHours = hours - bonusHours;
            salary += baseHours * baseRate;
            salary += bonusHours * bonusRate;
        }
        return salary;
    }
}
