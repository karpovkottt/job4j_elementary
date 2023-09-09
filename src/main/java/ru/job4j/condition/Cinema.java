package ru.job4j.condition;

public class Cinema {

    public static String access(int age) {
        System.out.println("The age of the customer is : " + age);
        String rsl;
        if (age >= 18) {
            rsl = "Welcome to the cinema.";
            System.out.println(rsl);
        } else {
            rsl = "It is not for you.";
            System.out.println(rsl);
        }
        return rsl;
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
