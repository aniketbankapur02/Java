package exceptionhandling;

public class Example1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {// which tries any exception
            int c = a / b;
        } catch (Exception e) {// if exception then catch will catch
            System.out.println(e.getMessage());// get clean error message wihtout any error 
        }
        // OR
        // try {
        //     int c = a / b;
        // } catch (ArithmeticException e) { = new Exception();
            
        // }
        /*
         Exception e = new ArithmeticException();
         ArithmeticException is child of Exception
         so parent dont know new properties of child
         here cannot use new properties of child
         */

         /*
          try means try ervything in this block and if somehting happens like any exception happens
          it will be catch by catch block 
          */
          try {// which tries any exception
            int c = a / b;
        } catch (Exception e) {// if exception then catch will catch
            System.out.println(e.getMessage());// get clean error message 
        }finally{
            // this code will be executed does not matter exception is thrown or not thrown
            System.out.println("this thing will be executed");
        }


    }
}
