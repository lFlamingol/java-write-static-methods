package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello();
        add();
    }

    public static void hello() {
        System.out.println(hello());
        return;
    }

    public static void add() {
        System.out.println(add(40, 2));
        return;
    }
}
