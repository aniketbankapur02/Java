package exceptionhandling;

public class Example2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        try {
            divide(a, b);
        } catch (Exception e) {// try code block exception (divide by zero exception) is catched here e  will be new ArithmeticException("Dont assign denominator value to zero")
        // it can be ArithmeticException e as well why Exception is working in the case of arithmetic exception is      
        System.out.println(e.getMessage()); 
        }finally{
            System.out.println("this thing will be executed");
        }

    }

    /*
     throw vs throws
     throw simply throw a new exception
     throws means to declare a exception at start /// saying that may throw an exception
     */

    // when a function throws a exception we should declare throws exception at startof exception
    static void divide(int a,int b) throws ArithmeticException {
        //edge case handling
        if (b == 0) {
            throw new ArithmeticException("Dont assign denominator value to zero");//explicit throw
        }
        System.out.println(a/b);
    }
}
