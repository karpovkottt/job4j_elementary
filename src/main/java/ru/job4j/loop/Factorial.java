package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result;
        result = n == 0 ? 0 : 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
