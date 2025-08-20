package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int[][] arr2 = {
                { 3, 4, 5 }, // 0th index
                { 6, 7 }, // 1st index
                { 8, 9, 10, 11 } // 2nd index
        };
        // input using loops
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // System.out.println(arr);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
