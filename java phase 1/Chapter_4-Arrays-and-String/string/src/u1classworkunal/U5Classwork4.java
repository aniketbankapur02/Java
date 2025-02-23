package u1classworkunal;

import java.util.ArrayList;

/*
 concat string via +
 */
public class U5Classwork4 {
    public static void main(String[] args) {
        System.out.println('a' + 'c');// accssi will get added

        System.out.println("a" + "b");// "ab"

        // typecast concate

        System.out.println("a" + 1);// first 1 is conerted to string and then it is concated
        System.out.println("a" + new ArrayList<>());// first empty array list(as we saw in preview it is empty space internally arraylist itself converted into string no need to even typecaste
        // System.out.println(new Integer(1) + new ArrayList<>());// error
        // above leds to error bec there is no operator overaloding

        /*
         java allows only operator overloading in the one case that is + for string only
         there is no concat for other complex object
         if expression has string it will concate else it will not
         that why it will throws error
         in python and c++ there is operator overlaoding in all cases 
         */

         System.out.println(new Integer(1) + " " + new ArrayList<>()); // now it will concate from Left to right


         


    }
}
