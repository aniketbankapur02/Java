package u1classworkunal;

import java.util.ArrayList;

/*
format specifier used to format string int decimals
https://stackabuse.com/how-to-format-a-string-in-java-with-examples/
 %c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */
public class U4Classwork3 {
    public static void main(String[] args) {
        System.out.printf("%.2f \n",3.142222222);// first arg should be string only o/p -> 3.14
        System.out.printf("%.2f \n",3.147222222);// o/p -> 3.15

        System.out.printf("%s there %c","Hello",'!');

        System.out.println(new ArrayList<>());

        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.println(a);
        /*
        when we print a we dont get reference code like normal array as normal array do not overrides toString method during println method
        arraylist calls to string method internally when println method is called
        tostring method focus on array element formula for converstion to string [e1,e2,...] it will not take reference code of a
        as elements are empty tosrtring returns [] 
        as a reprenting whole whole list which is internally convertd to string
        as list is blank it is returing [] not reference code bec of converstion to string internally by toString

        you can see default value is blank via clt + right
         arrayli
         */
        // int[] a1 = new int[3];

        // System.out.println(a1);
        /*
        o/p -> you get reference code not to string value
         As when normal array is passed as arg it will not override tostring method
         so normal [I@hexacode converstion is made and it is return 
         */
    }
}
