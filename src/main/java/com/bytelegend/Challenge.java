package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        return "Hello";
    }

    public static Integer add(Integer x, Integer y) {
        return x + y;
    }
}
