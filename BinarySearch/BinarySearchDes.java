package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class BinarySearchDes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        System.out.print("\nThe array you have entered: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("\nThe sorted array is: " + Arrays.toString(arr));

        int ans = BinarySearch(arr, target);
        if (ans == -1) {
            System.out.println("Target element not found.");
        } else {
            System.out.println("The target element is found at index: " + ans);
        }

    }

    static int BinarySearch(Integer[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
