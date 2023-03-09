package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello();
        int total = add(40,2);
        System.out.println(total);
    }

    public static String hello() {
        System.out.println("Hello");
        return;
    }

    public static Int add(int a, int b) {
        return a + b;
    }
}
