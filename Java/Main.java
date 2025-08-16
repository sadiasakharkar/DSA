package Java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());

        System.out.println("Primitive types:");
        int integervalue = 5;
        char charactervalue = 'c';
        float floatvalue = 95.5f;
        double largedecimalnumber = 123456789.987654321;
        long longintergervalue = 1234567890123456789L;
        boolean booleanvalue = true;

        System.out.println("Integer: " + integervalue);
        System.out.println("Character: " + charactervalue);
        System.out.println("Float: " + floatvalue);
        System.out.println("Double: " + largedecimalnumber);
        System.out.println("Long: " + longintergervalue);
        System.out.println("Boolean: " + booleanvalue);
    }
}