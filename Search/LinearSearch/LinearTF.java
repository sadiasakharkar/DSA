package LinearSearch;

public class LinearTF {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 8, 7, 9, 10 };
        int target = 7;

        boolean search = LinearSearch(arr, target);
        System.out.println("The target element " + target + " is found " + search);

    }

    // we will return the index of the element where it is found
    // if not found we will return -1
    static boolean LinearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index <= arr.length; index++) {
            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }

}
