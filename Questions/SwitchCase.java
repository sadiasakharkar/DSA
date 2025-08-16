package Questions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        // switch (fruit) {
        // case "apple":
        // System.out.println("Apple is red in color");
        // break;
        // case "banana":
        // System.out.println("Banana is yellow in color");
        // break;
        // case "grapes":
        // System.out.println("Grapes are green in color");
        // break;
        // case "orange":
        // System.out.println("Orange is orange in color");
        // break;
        // default:
        // System.out.println("Unknown fruit");

        // new switch expression
        switch (fruit) {
            case "apple" -> System.out.println("Apple is red in color");
            case "banana" -> System.out.println("Banana is yellow in color");
            case "grapes" -> System.out.println("Grapes are green in color");
            case "orange" -> System.out.println("Orange is orange in color");

        }
    }
}
