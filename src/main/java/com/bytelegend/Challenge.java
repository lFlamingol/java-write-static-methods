package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        String c = "Hello";
        return c;
    }

    public static int add(int a , int b) {
        int i = a + b;
        return i;
    }
}
