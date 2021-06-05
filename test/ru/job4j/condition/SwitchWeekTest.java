package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDayIs1() {
        int in = 1;
        String expected = "Понедельник";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs2() {
        int in = 2;
        String expected = "Вторник";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs3() {
        int in = 3;
        String expected = "Среда";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs4() {
        int in = 4;
        String expected = "Четверг";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs5() {
        int in = 5;
        String expected = "Пятница";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs6() {
        int in = 6;
        String expected = "Суббота";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs7() {
        int in = 7;
        String expected = "Воскресенье";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs0() {
        int in = 0;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs8() {
        int in = 8;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsMinus1() {
        int in = -1;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, result);
    }
}