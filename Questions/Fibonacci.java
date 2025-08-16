package Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of Fibonacci series: ");
        int n = sc.nextInt();

        int count = 2;

        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;

            count++;

        }
        System.out.println(b);

    }

}
