import java.util.*;

public class SubsetSumRecursion {
    public static boolean subsetSum(int[] arr, int index, int target, List<Integer> current, List<Integer> result) {
        // Base case: if target becomes 0 → we found a valid subset
        if (target == 0) {
            result.addAll(current);
            return true; // return success
        }

        // If we run out of elements OR target goes negative → not possible
        if (index == arr.length || target < 0) {
            return false; // dead end
        }

        // Choice 1: Include current element
        current.add(arr[index]);
        boolean include = subsetSum(arr, index + 1, target - arr[index], current, result);
        current.remove(current.size() - 1); // backtrack

        if (include)
            return true; // found valid subset, stop here

        // Choice 2: Exclude current element
        boolean exclude = subsetSum(arr, index + 1, target, current, result);

        return exclude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        boolean exists = subsetSum(arr, 0, target, current, result);

        System.out.println("Subset exists? " + exists);
        if (exists) {
            System.out.println("One subset that sums to " + target + ": " + result);
        }

        sc.close();
    }
}
