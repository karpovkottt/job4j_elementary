package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CinemaTest {

    @Test
    void when21ThenGreet() {
        int in = 21;
        String expected = "Welcome to the cinema.";
        String result = Cinema.access(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when16ThenBye() {
        int in = 16;
        String expected = "It is not for you.";
        String result = Cinema.access(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when18ThenGreet() {
        int in = 18;
        String expected = "Welcome to the cinema.";
        String result = Cinema.access(in);
        assertThat(result).isEqualTo(expected);
    }
}