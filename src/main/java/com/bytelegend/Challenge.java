package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        int total = add(1, 2);
        System.out.println(total);
    }

    public static String hello() {
        return "Hello";
    }

    public static int add(int a, int b) {
        return a + b;
    }
}