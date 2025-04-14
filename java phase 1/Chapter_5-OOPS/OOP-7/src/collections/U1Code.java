package collections;

import java.util.*;

public class U1Code {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();//<E> should be replace by something
        List<Integer> l2 = new LinkedList<>();//<E> should be replace by something

        // explore all methods


        //vectors : same as arraylist but it is syncronized ie only one thread can access object at one time only this is the difference
        // if two thread want to access object the object one thread has to wait 
        // to which is vector are slower than arraylist
        // vector are mostly used in multi threaded application for thread safety

        List<Integer> l3 = new Vector<>();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        System.out.println(l3);
    }
}