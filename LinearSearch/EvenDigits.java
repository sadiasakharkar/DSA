// Q : find numbers with even number of digits in an array // Leetcode 

package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
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

    static int number(int num) { // function to count the number of digits in a number
        if (num < 0) { // if the number is negative, convert it to positive
            num = num * -1; // num * -1 will convert negative to positive
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
