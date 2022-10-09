package com.bytelegend;


/**
 * @author haohao
 */
public class Challenge {

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    /**
     * 输出 hell
     * @return
     */
    public static String hello() {
        String str = "Hello";
        return str;
    }

    /**
     * 输出 add
     * @param a
     * @param b
     * @return
     */
    public static Integer add(Integer a, Integer b) {
        Integer inter = a + b;
        return inter;
    }
}
