package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void when1ThenMon() {
        int day = 1;
        String expected = "Monday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2ThenTue() {
        int day = 2;
        String expected = "Tuesday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3ThenWed() {
        int day = 3;
        String expected = "Wednesday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4ThenThu() {
        int day = 4;
        String expected = "Thursday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5ThenFri() {
        int day = 5;
        String expected = "Friday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6ThenSat() {
        int day = 6;
        String expected = "Saturday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7ThenSun() {
        int day = 7;
        String expected = "Sunday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownThenError() {
        int day = 10;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }
}