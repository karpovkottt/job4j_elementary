package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenMonThen1() {
        String name = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(name);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSredaThen3() {
        String name = "Среда";
        int expected = 3;
        int result = MultipleSwitchWeek.numberOfDay(name);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownThenMinus1() {
        String name = "Mon";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(name);
        assertThat(result).isEqualTo(expected);
    }
}