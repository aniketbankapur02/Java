package u1classworkunal;

import java.util.Arrays;
import java.util.Scanner;

/*
array of objects

 String[] arr = new String[2]

 -----

 taking input and output of array via loop and each for loop(it is not a nested loop which used for output)

 ----

 Arrays class so String is class it has lot of methods
 so java made array class to have lot functionality to sort etc arguments for this methos is array reference code

 https://www.w3schools.com/java/java_ref_arrays.asp

 -----

 modify array via []
 */
public class U1ClassWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[4];// here array has 4 element of 0 value 

        // here it is travsered according to number of array elment that is 4 due to this is traversed 4 times
        //in each iteration i is assigned to new array element  
        // for(int i : arr){
        //     arr[i] = sc.nextInt();// so here i everytime is assigned to zero as all array element is 0 (default values) and input is given to zero index only it is not moving
        // }
        // so use for rach array for output only for input we have to use i++


        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = sc.nextInt();
        // }
        
/*
 here array size is 4 so traversing will be 4 times
 each iteration i is assigned to new index element value from start starting index to last index
 */
/*
 lets suppose array is 33,44,55,66 ( given by input)
 */
        for(int i : arr1){ // i is freshly assigned by array element for each traversing 
            // System.out.println(arr[i]); for 1 st iteration i value will be 33 here you will get error of index out of found arr[33] there is not index of 33 for array of size 4
            System.out.println(i);//this is correct way 
            /*
            for 1st iteration i will 33
            for 2nd iteration i will 44
            for 3rd iteration i will 55
            for 4th iteration i will 66

            here you are getting direct array element value so print it

            if you dont assign value default will be printed ie 0
            */ 
        }

        int[] arr2 = new int[]{44,33,22,11};


        Arrays.sort(arr2);// it void method

        for (int i : arr2) {// each element of array is assigned to i
            System.out.println(i);
        }

        /*
         you want to convert array to one string chunk not array char
         you can do via toString method return type is one string

         same thing {44,33,22,11} is returned in one string having [] brackets to start and end
         */

         String str = Arrays.toString(arr2); // you an assign string  or directly print it
         // even converstion logic is simple just append element one by one to empty string type cast will happen
         
         System.out.println(str);

         /*
          three methods for array printing array normal for i loop and for each loop and toString loop
          */


          /*
           array objects in java
           */

           String[] arr3 = {"aa","bb","c","d"};
        //    String[] arr3 = new String[4];

        //    for (int i = 0; i < arr3.length; i++) {
        //     arr3[i] = sc.next();
        //    }

           for (String string : arr3) {// string is assiened by string array element
            System.out.println(string);
           }

           // i can change object value by accesing heap objects via []

           arr3[2] = "aniket";

           for (String string : arr3) {// array index 2 is modifyed via [] so now index 2 will be printed as aniket 
            System.out.println(string);
           }


    }
}
