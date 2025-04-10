package exceptionhandling;
// try catch ladder timestamp 1:08:00

/*
 here there are two catch
 this try catch catch ladder is not like if else ladder
 even if 1st catch is executed 2nd catch will be executed
 so always strict/specific rules should come above
 
order 1 which is fine
catch (ArithmeticException e) -> this will catch arithematic exeception only  
catch (Exception e) -> if something remains other than arithematic this Exception will catch it as Exception is parent of all Exceptions it can handle handle all Exceptions

order 2 which is not fine
catch (Exception e) -> this can catch arithmatic exception as well as it is parent of exeception
so below arithmatic will cause an error saying parent Exception already cought this arithmatic exception
java is telling at compile time that this catch (ArithmeticException e) is a dead code it is not needed as arithmatic exception is handled by parent so dont need to write this 
->Unreachable catch block for ArithmeticException. It is already handled by the catch block for ExceptionJava(553648315)
catch (ArithmeticException e) -> this will catch arithematic exeception only  


*/
public class Example3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
//--------------------> order 1
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this thing will be executed");
        }

//--------------------> order 2 (here arithmatic is dead code bec at top parent class is there which can catch arthimatic exception as well so writing arithematic exception below parent exception is not needed)
        // try {
        //     divide(a, b);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("this thing will be executed");
        // }
    }

    static void divide(int a, int b) throws ArithmeticException {
        // edge case handling
        if (b == 0) {
            throw new ArithmeticException("Dont assign denominator value to zero");// explicit throw
        }
        System.out.println(a / b);
    }
}
