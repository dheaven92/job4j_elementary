package ru.job4j.array;

public class Initials {

    public static String convert(String[] fio) {
        if (fio.length < 3) {
            throw new IllegalArgumentException("Invalid fio format");
        }
        return fio[0] + ' ' + Character.toUpperCase(fio[1].charAt(0)) + '.' + Character.toUpperCase(fio[2].charAt(0)) + '.';
    }
}
