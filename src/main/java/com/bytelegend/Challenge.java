package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        int x = add();
        hello();
        System.out.println(x);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static void add() {
        int number = 4+2;
        return number;
    }
}