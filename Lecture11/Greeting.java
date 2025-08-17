package Lecture11;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String g = greet();
        System.out.println(g);
    }

    static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        String greeting = "Hello, " + name + "!";
        return greeting;
    }
}
