package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public String hello(){
        return "Hello";
    }
    
    public int add(int a, int b){
        return a + b;
    }
}
