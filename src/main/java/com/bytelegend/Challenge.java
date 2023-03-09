package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello();
        int total = add();
        System.out.println(total);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static int add() {
        int a = 40;
        int b = 2;
        return a + b;
    }
}