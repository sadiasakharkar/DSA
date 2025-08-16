package Java;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("\nwhile loop");
        // WHILE LOOP
        while (n <= 10) {
            System.out.println("hello world");
            n++;
        }

        System.out.println("\nfor loop");
        // FOR LOOP
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i);
        }

        System.out.println("\ndo while loop");
        // do while loop
        int m = 1;
        do {
            System.out.println(m);
            m += 1;
        } while (m <= 10);

        int x = 1;
        do {
            System.out.println("hello world");
        } while (x != 1); // in do while loop, the body is executed at least once even if the condition is
                          // false
    }
}
