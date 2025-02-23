package u1classworkunal;

import java.util.Arrays;

public class U3Classowork2 {
    public static void main(String[] args) {
        System.out.println(5);// calling int parameter works as expected it returns string
        System.out.println("xyz"); // calling string parameter works as expected it returns string

// calling object parameter will not works as expected it returns reference code not string
// so we need to convert first to string and then we should call println method and println calls string parameter method(a right method call) and now it will work like xyz method ie it will return string  
        System.out.println(new int[]{1,2,3,4,5});// this will call object parameter not array parameter
        // so above will not work as expected as it cannonvert array to string
        // so first we have to convert array to string then we will call println
        // println calls string parameter and works as expected
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));// converting first to string and sending converted array string to string parameter method as a call

        // we can pass integer by converting it to string before passing so the printtln parameter should be string during call
        
        Integer a = 56;

        System.out.println(a.toString());// clt + right to see that string parameter method is called not object parameter method is called
    }
}
