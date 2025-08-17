package Lecture11;

import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you name : ");
        String name = sc.nextLine();
        String personal = mygreet(name);
        System.out.println(personal);
    }

    static String mygreet(String name) {
        String greeting = "Hello," + name + "!";
        return greeting;
    }
}
