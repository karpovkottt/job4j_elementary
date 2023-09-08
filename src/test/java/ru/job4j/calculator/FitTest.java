package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan175Then86Dot25() {
        short in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman162Then59Dot8() {
        short in = 162;
        double expected = 59.8;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}