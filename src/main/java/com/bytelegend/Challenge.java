package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        return "Hello";
    }

    public static int add(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
