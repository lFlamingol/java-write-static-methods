package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        hello("Hello");
        add(40, 2);
    }

    static void hello(String a) { System.out.println(a);}

    static void add(int b, int c) {System.out.println(Integer.sum(b,c));}
}