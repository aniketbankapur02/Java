package u1classwork;

public class U7MethodOverloading {
    public static void main(String[] args) {
        fun(12); // fun with int a parameter is called
        fun("hello"); // fun with String a parameter is called

        System.out.println(add(1, 2));// here two parameter method is called
        System.out.println(add(1, 2, 3));// here three parameter method is called

        // fun();// ambigious error he dont which one to run
        // so during normal method call for var args you dont need to pass arguments
        // (there is no restriction to pass arguents like for normal methods)
        /*
         * but during method over loading method call for vargs you must need to pass
         * arguments to avoid ambigous error
         */

        // you can test by making fun to fun1

        //  fun1(); // error The method fun1(int[]) is ambiguous for the type U7MethodOverloading(meaning he cannot understand which one to run)
        fun1("String1","String2"); // this will call string vargs function
        fun1(1,2); // this will call int vargs function
        
        
        
        // when you pass one argument it calls normal int method not vars args int
        // method

        fun(13, 11); // fun with int a parameter is called
        fun("hello", "hi"); // fun with String a parameter is called

    }

    static void fun(int... a) {
        System.out.println("fun with vargs int " + a[0]);
    }

    static void fun(String... a) {
        System.out.println("fun with vargs string  " + a[1]);
    }
    static void fun1(int... a) {
        System.out.println("fun1 with vargs int " + a[0]);
    }

    static void fun1(String... a) {
        System.out.println("fun1 with vargs string  " + a[1]);
    }

    static void fun(int a) {
        System.out.println("fun with one parameter int " + a);
    }

    static void fun(String a) {
        System.out.println("fun with one parameter String " + a);
    }

    static int add(int a, int b) {// add method two parameter
        return a + b;
    }

    static int add(int a, int b, int c) {// add method with three parameter
        return a + b + c;
    }

}
