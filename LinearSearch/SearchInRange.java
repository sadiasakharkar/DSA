package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 5, 76, 23, 89, 32, 12, 54 };
        int target = 32;

        int ans = LinearSearch(arr, target, 2, 5);
        System.out.println("The target element is found at index: " + ans);
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
