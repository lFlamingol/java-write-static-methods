package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        return "Hello";
    }

    public static int add(int a,int b) {
        return b+a;
        // for (i=0,i<a,i++){
        //     b++;
        // }
        // return b;
    }
}
