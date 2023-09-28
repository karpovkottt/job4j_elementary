package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2.0;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02To22Then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To22Then1Dot43() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111To222Then1Dot73() {
        double expected = 1.73;
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double out = a.distance3D(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123To112Then1Dot43() {
        double expected = 1.42;
        Point a = new Point(1, 2, 3);
        Point b = new Point(1, 1, 2);
        double out = a.distance3D(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111To111Then1Dot43() {
        double expected = 0;
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double out = a.distance3D(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}