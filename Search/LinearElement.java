package Search;

public class LinearElement {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 8, 7, 9, 10 };
        int target = 7;

        int search = LinearSearch(arr, target);
        System.out.println("the target element is found the element is " + search);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
