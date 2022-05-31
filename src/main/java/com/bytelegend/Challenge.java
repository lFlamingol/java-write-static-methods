package com.bytelegend;

public class Challenge {
    private static int a = 2;
    private static int b = 40;

    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(a, b));
    }

    public static String hello() {
        return "Hello";
    }

    public static int add(int z,int y) {
        return z + y;
    }
}
