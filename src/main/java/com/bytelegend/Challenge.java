package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello();
        add(40, 2);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static int add(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
