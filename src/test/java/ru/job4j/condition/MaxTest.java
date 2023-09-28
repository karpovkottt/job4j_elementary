package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To8To8Then8() {
        int first = 8;
        int second = 8;
        int third = 8;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3To7Then7() {
        int first = 5;
        int second = 3;
        int third = 7;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To2Then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To3Then3() {
        int first = 3;
        int second = 1;
        int third = 3;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int fourth = 3;
        Max max = new Max();
        int result = max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To9To3To5Then9() {
        int first = 8;
        int second = 9;
        int third = 3;
        int fourth = 5;
        Max max = new Max();
        int result = max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1To2To2Then2() {
        int first = 1;
        int second = 1;
        int third = 2;
        int fourth = 2;
        Max max = new Max();
        int result = max.max(first, second, third, fourth);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}