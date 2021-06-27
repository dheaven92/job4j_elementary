package ru.job4j.array;

public class WordsToText {

    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word).append(' ');
        }

        return result.toString().trim();
    }
}
