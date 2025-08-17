package Lecture11;

public class Scope {
    public static void main(String[] args) {
        int a = 30;
        int b = 80; // This 'b' is local to the main method
        // System.out.println(c); // This would cause an error because 'c' is not
        // defined in this scope

        {
            int c = 90; // This 'c' is local to this block
            a = 88; // This modifies the 'a' defined in the main method
            // int a = 90; // This would cause an error because 'a' is already defined in
            // the outer scope
            System.out.println("Inside block: a = " + a + ", b = " + b + ", c = " + c);
        }

        int c = 100; // This 'c' is local to the main method , this can be again initialized outside
                     // the block
        { // This is a new block
          // int c = 90; // This 'c' is local to this block
            a = 88;
            // int a = 90; // This would cause an error because 'a' is already defined in
            // the outer scope
        }
    }
}
