// Q: find the maximum wealth among customers // Leetcode
package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 5, 6 }
        };
        int maxWealth = maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + maxWealth);

    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; // Initialize to the smallest integer value
        int sum = 0;
        for (int person = 0; person <= accounts.length; person++) {
            for (int account = 0; account <= accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum; // Update ans if the current sum is greater
            }
        }
        return ans; // Return the maximum wealth found
    }
}
