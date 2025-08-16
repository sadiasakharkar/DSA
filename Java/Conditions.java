package Java;

import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        /*
         * this is multi line comment in java
         * 
         * if (boolean condition T or F){
         * body
         * } else {
         * }
         */

        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        // if (salary > 20000) {
        // System.out.println("You have bonus of Rs: 1000");
        // salary += 1000;
        // } else {
        // System.out.println("You have bonus of 500");
        // salary += 500;
        // }

        // System.out.println("Total: " + salary);

        // if esle if

        if (salary > 10000) {
            salary += 1000;
        } else if (salary > 5000) {
            salary += 500;
        } else {
            salary += 100;
        }
        System.out.println("Total: " + salary);
    }

}
