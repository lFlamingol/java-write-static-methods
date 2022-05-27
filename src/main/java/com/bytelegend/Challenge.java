package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(2, 2));
    }

    public static String hello() {
        return "Hello";
    }

    public static int add(int z,int y) {
        z = z + 40;
        return z + y;
    }
}
