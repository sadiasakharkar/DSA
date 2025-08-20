package Array;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(67);
        list.add(89);
        list.add(12);
        System.out.println(list);

        list.add(2, 100); // inserting at index 2
        System.out.println(list);
    }
}
