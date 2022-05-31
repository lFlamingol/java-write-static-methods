package com.bytelegend;

public class Challenge {
    private int a = 2;
    private int b = 40;

    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(a, b));
    }

    public static void hello() {
        return "Hello";
    }

    public static int add(int z,int y) {
        return z + y;
    }
}
