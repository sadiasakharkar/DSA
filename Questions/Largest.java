package Questions;

import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Q: To find the largest number");

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();

        // METHOD : 01
        // int max = num1;
        // if (num2 > max) {
        // max = num2;
        // }
        // if (num3 > max) {
        // max = num3;
        // }

        // METHOD : 02
        // int max = 0;

        // if (num1 > max) {
        // max = num1;
        // } else {
        // max = num2;
        // }

        // if (num3 > max) {
        // max = num3;
        // }
        // System.out.println("Largest number is : " + max);

        // int max = Math.max(num1, num2);
        // int finalmax = Math.max(max, num3);

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println("Largest number is : " + max);
    }
}
