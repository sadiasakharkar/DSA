package Lecture11;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
