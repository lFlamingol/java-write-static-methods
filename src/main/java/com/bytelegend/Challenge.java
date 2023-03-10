package com.bytelegend;


public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        System.out.println("Hello");
        return "Hello";
    }
    public static int add(int z,int y) {
        System.out.println("z+y");
        return z + y;
    }
}