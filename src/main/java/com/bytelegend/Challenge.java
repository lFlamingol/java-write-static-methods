package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        String a = "Hello";
        return a;
    }

    public static int add(int a , int b) {
        int sum = a + b;
        return sum;
    }
}
