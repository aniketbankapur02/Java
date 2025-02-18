package u1classworkunal;

import java.util.ArrayList;
import java.util.Scanner;

public class U4_DynamicArray {
    public static void main(String[] args) {
        // ArrayList ref_var = new ArrayList<>(); its fine you dont define type during compile time as it is decided in runtime like python
        // best practice is to menstion type
        // ArrayList<Integer> ref_var = new ArrayList<>(); if you dont menstion size it is fine you add above it
        ArrayList<Integer> ref_var = new ArrayList<>(5);
// initial capacity is set to 5  but i can add more than 5 as it size is dynamic it can change during runtime
        ref_var.add(1);
        ref_var.add(2);
        ref_var.add(3);
        ref_var.add(4);
        ref_var.add(5);
        ref_var.add(6);
        ref_var.add(7);


        // if you print normally it converts to to string and print it

        System.out.println(ref_var);

        // ArrayList methods
        // contains(element) 
        System.out.println(ref_var.contains(5));// it has return type of boolean
        
        // set(index,element)

        ref_var.set(0, 99);

        System.out.println(ref_var);

        // remove(index) // element is removed from that index and next elment index is assigned to current index and overall one size is reduced last index element is assigned to second last element
        // next index element is assigned to current index

        ref_var.remove(1);
        /*
        most method are overaloaded meaning we can give index,object and lot other args to remove method
        */

        System.out.println(ref_var);
    Scanner sc = new Scanner(System.in);
        // input and output of arraylist

        // for (int i = 0; i < ref_var.size(); i++) {
        //     //ref_var.set(i,sc.nextInt());
        //     // we can use add
        //     ref_var.add(sc.nextInt());// here we are continously taking element one by one 
        // }
    // for (int i = 0; i < ref_var.size(); i++) {// no stress of size we can add unlimited elements
    //     System.out.println(ref_var.get(i));
    // }

    // there is issue in size taking like as ref can be unlimited there is no fix size for it so it can be notmal that it never stops asking me element size
        for (int i = 0; i < 5; i++) {
            ref_var.set(i,sc.nextInt());// this is proper appending via index(not extending)
            // we can use add
            // ref_var.add(sc.nextInt());// here we are continously appending to array(extending) and making size bigger taking element one by one 
        }
    for (int i = 0; i < 5; i++) {// no stress of size we can add unlimited elements
        System.out.println(ref_var.get(i));
    }

    for(int i : ref_var){// i is assigned everytime by ref_var reference variable
        /*
    list is traversed everytime and int i is assigned by arrayList 
        */ 
        System.out.println(i);
    }
    }
}
