package QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        int n = arr.length;

        quicksort(arr, 0, n - 1); // low will be 0 and high will be n-1 , it will not be high Think: “Hey
                                  // computer, sort all the numbers from start to end.”
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // selection pivot as last element
        int i = low - 1; // i = -1

        for (int j = low; j < high; j++) { // high is not included because it is pivot
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index

    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);

        }
    }

}
