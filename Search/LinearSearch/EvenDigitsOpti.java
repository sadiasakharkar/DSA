// Q : find numbers with even number of digits in an array // Leetcode 
// this is an optimized version of the EvenDigits class
package LinearSearch;

import java.lang.Math;

public class EvenDigitsOpti {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896, 2345, 23, 9876, 0 };
        int ans = findnumbers(nums);
        System.out.println("The count of numbers with even digits is: " + ans);
    }

    static int findnumbers(int[] nums) { // function to find numbers with even digits
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) { // function to check if the number has even digits
        int NoOfDigits = number(num);
        return NoOfDigits % 2 == 0;
    }

    static int number(int num) {
        if (num < 0) {
            num = num * -1; // num * -1 will convert negative to positive
        }
        return (int) (Math.log10(num) + 1);
    }
}
