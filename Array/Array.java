package Array;

public class Array {
    public static void main(String[] args) {
        // syntax for array
        // 1. Declaration
        // 2. Instantiation
        // 3. Initialization

        int[] arr; // Declaration
        arr = new int[5]; // Instantiation. // actual memory allocation
        // datatype[] variable_name = new datatype[size];

        /// Q - store 5 roll no
        int[] rollno = new int[5];
        int[] rollno1 = { 1, 2, 3, 4, 5 };

        System.out.println(rollno1[0]);

        // null
        String name = null; // this will not give error
        // int a = null ; // this will give error
    }
}
