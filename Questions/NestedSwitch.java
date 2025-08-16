package Questions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter emp id and department : ");

        int id = sc.nextInt();
        String department = sc.next();

        switch (id) {
            case 1 -> System.out.println("Employee id is 1");
            case 2 -> System.out.println("Employee id is 2");
            case 3 -> {
                System.out.println("Employee id is 3");
                switch (department) {
                    case "HR" -> System.out.println("Department is HR");
                    case "IT" -> System.out.println("Department is IT");
                    case "Finance" -> System.out.println("Department is Finance");
                    default -> System.out.println("Unknown department");
                }
            }
            default -> System.out.println("Unknown employee id");

        }
    }
}