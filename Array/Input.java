package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // array of primitives
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;

        // System.out.println(arr[2]);

        // input using loops

        for (int i = 0; i <= arr.length - 1; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        System.out.println("\nPrinting using for loop:");
        System.out.println("Array elements are:");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nPrinting using for-each loop:");
        // printing using enhanced for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nPrinting using array.toString() method:");
        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] names = new String[5];
        for (int i = 0; i <= names.length - 1; i++) {
            Scanner sc = new Scanner(System.in);
            names[i] = sc.next();
        }
        System.out.println("\nPrinting names:");
        System.out.println(Arrays.toString(names));
    }
}
