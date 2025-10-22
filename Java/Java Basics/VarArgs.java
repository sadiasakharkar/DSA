package Lecture11;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 53, 22, 31, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        fun2(3, 4, "Hello", "World", "VarArgs", "Example");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun2(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }
}
