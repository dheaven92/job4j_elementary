package ru.job4j.condition;

public class ChessBoard {

    private static boolean isValueValid(int value) {
        return value >= 0 && value <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {

        if (isValueValid(x1) && isValueValid(x2) && isValueValid(y1) && isValueValid(y2)) {

            int xDifference = Math.abs(x2 - x1);
            int yDifference = Math.abs(y2 - y1);

            if (xDifference == yDifference) {
                return xDifference;
            }
        }

        return 0;
    }
}
