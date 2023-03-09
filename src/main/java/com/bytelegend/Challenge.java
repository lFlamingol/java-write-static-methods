package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello();
        int total = add(40, 2);
        System.out.println(total);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}