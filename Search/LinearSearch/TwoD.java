package LinearSearch;

import java.util.Arrays;

public class TwoD {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6, 45 },
                { 7, 8, 9, 56 }
        };
        int target = 56;

        int[] ans = LinearSearch(arr, target);
        System.out.println("The target element is found at index: " + Arrays.toString(ans));
    }

    static int[] LinearSearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
