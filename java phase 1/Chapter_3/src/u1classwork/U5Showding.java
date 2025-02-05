package u1classwork;

public class U5Showding {
    static int x = 90;
    int y = 10; 
    public static void main(String[] args) {
        // int y = 1;
        // shadowing is not for instance varibale it is for static variables only 
        // System.out.println(y);


        System.out.println(x);// o/p 90 here static varibale is taken as there is no x above in this method

        int x ;
        //System.out.println(x);// general error x is not initlized this means it is taking local variable not static variable
        // general error bec there is no default value for local variables
        // here local x is taken not static as x is locally defined over here local x overrides static x and static x is shadowed
        // so nearest value is taken
        x = 40;// assigning local variable to avoid general error
        
        System.out.println(x);// o/p is 40 as it takes nearest value not static value as nearest value overrides static x and static x is shadowed

        fun();// o/p is 90



    }

    static void fun(){
        System.out.println(x);// o/p 90 as there is no x defined in this method and also main method x is not been taken as it is out of method scope 
    }


}
