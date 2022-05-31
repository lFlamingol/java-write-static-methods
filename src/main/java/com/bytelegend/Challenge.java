package com.bytelegend;

int a = 2;
int b = 40;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(a, b));
    }

    public static void hello() {
        return "Hello";
    }

    public static int add(int z,int y) {
        return z + y;
    }
}
