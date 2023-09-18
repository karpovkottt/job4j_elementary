package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {

    @Test
    void whenEqual() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEqual() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {3, 3, 4};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }
}