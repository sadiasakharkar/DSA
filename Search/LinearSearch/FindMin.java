package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 15, 12, -7, 45, 2 };
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        return min;
    }

}
