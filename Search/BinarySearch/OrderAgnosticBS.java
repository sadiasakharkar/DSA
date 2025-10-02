package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -6, -5, -2, 0, 1, 2, 3, 4, 5 };
        int[] arr = { 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5 };
        int target = 0;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // to find if teh expression is in asc or desc order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
