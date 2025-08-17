package Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        boolean result = armstrong(number);
        System.out.println(number + " is an Armstrong number: " + result);

        System.out.println("Armstrong numbers between 100 and 1000 are:");
        for (int i = 100; i <= 1000; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean armstrong(int n) {
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }

        if (sum == ori) {
            return true;
        } else {
            return false;
        }
    }
}
