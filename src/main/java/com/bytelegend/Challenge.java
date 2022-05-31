package com.bytelegend;

String hello = "Hello";
int a = 2;
int b = 40;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello);
        System.out.println(add(a, b));
    }

    public static String hello(String x) {
        return x;
    }

    public static int add(int z,int y) {
        return z + y;
    }
}
