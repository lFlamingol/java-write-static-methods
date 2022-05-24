package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static String hello() {
        return "Hello";
    }

    public static int add(int z,int y) {
        return z + y;
    }
}
public static void main (String[]args){
    Challenge a = new Challenge("a");
    a.hello();
    a.add(2,2);
}