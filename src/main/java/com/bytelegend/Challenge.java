package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        return "hello";
    }

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }
}
