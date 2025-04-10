package exceptionhandling;
/*
 specific exception is written based on chances that it may occur
 based on specific exception you can write specific catch code and it should be above parent Exception class 
 */
public class Example5 {
    public static void main(String[] args) {
        try{
            String name = "xyz";
            if (name.equals("xyz")) {
                throw new CustomException("Custom Exception");
            }
        }catch(ArithmeticException e){// if ArithmeticException is thrown in try block then this catch code block will be executed 
            System.out.println(e.getMessage());
        }catch(CustomException e){// if CustomException is thrown in try code block then this catch block is executed
            System.out.println(e.getMessage());
        }
        /*
         already strict/specific child exception is written at top now we can write parent Exception to catch any child exception
         Exception is parent class which can handle any child exception
         */
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*
         as CustomException is thrown so CustomException catch block is executed
         */
    }
}
