package ru.job4j.loop;

public class Hamming {

    public static int checkStrings(String left, String right) {
        int count = 0;

        if (!left.equals(right)) {
            String[] leftChars = left.split("");
            String[] rightChars = right.split("");

            for (int i = 0; i < leftChars.length; i++) {
                if (!leftChars[i].equals(rightChars[i])) {
                    count++;
                }
            }
        }

        return count;
    }
}
