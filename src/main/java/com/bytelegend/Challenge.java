package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static void hello() {
        return "Hello";
    }

    public static int add(int... ints) {
        return java.lang.util.IntStream.of(ints).sum();
    }
}
