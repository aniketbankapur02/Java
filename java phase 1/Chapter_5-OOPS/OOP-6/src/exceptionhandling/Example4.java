package exceptionhandling;
// try catch ladder timestamp 1:09:30

public class Example4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            // divide(a, b); divide function will throw this exception  ArithmeticException("Dont assign denominator value to zero");// bec of explicit throw 
            // we can do more explicit throw 
            throw new Exception("Message : just for learning");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this thing will be executed");
        }

    }

    static void divide(int a, int b) throws ArithmeticException {
        // edge case handling
        if (b == 0) {
            throw new ArithmeticException("Dont assign denominator value to zero");// explicit throw
        }
        System.out.println(a / b);
    }
}
