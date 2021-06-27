package ru.job4j.array;

public class DestroySequence {

    public static char[] destroy(char[] seq) {
        if (seq.length < 10) {
            throw new IllegalArgumentException("Invalid seq!");
        }

        for (int i = 0; i < 5; i++) {
            seq[i] = '0';
            System.out.print(seq[i] + " ");
        }

        int count = 0;
        while (count < 5) {
            seq[seq.length - 1 - count] = '1';
            count++;
        }

        return seq;
    }
}
