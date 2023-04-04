package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        System.out.println("Hello");
        return "Hello";
    }

    public static int add(int x,int y) {
        System.out.println("x+y");
        return x + y;
    }
}
