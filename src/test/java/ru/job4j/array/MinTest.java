package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = new int[] {1, 2, 3};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = new int[] {15, 10, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = new int[] {8, 10, 3, 5, 9};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}