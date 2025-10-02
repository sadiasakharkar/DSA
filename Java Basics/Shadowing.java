package Lecture11;

public class Shadowing {
    static int x = 10; // class variable // this will be shadowed in line 10

    public static void main(String[] args) {
        System.out.println(x); // 10
        method();
        int x = 20; // This class varibale at line 4 is shadowed by this local variable
        System.out.println(x); // This x shadows the class variable x // 20
    }

    static void method() {
        System.out.println(x);
    }
}

// int x -> this is declaration
// x = 20 -> this is initialization // at this point the class variable x is
// shadowed by the local variable x