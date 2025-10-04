package LinearSearch;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "sadia";
        char target = 'i';

        System.out.println(Arrays.toString(name.toCharArray()));

        boolean ans = LinearSearch(name, target);
        System.out.println("This result is printed using for loop " + ans);

        boolean ans2 = LinearSearch(name, target);
        System.out.println("This result is printed using for each loop " + ans2);
    }

    static boolean LinearSearch(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int index = 0; index <= name.length(); index++) {
            if (name.charAt(index) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean LinearSearch2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
