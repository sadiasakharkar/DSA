package Lecture11;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(4, 5);
        fun(56, 77, 32);
        fun(234, 56, 23, 13, 34, 21, 78, 554);
    }

    static void fun(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }

    static void fun(int a, int b, int c) {
        System.out.println("Three integers: " + a + ", " + b + ", " + c);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

}
