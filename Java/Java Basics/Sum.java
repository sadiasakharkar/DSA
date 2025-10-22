package Lecture11;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Sum();
        System.out.println();
        int ans = Sum2();
        System.out.println(ans);
        System.out.println();

        int c = Sum3(5, 7);
        System.out.println("Sum of 5 and 7 is: " + c);
    }

    static void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum:" + sum);
    }

    static int Sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum:" + sum);
        return sum;
    }

    static int Sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
