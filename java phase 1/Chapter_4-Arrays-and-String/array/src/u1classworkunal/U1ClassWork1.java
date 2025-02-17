package u1classworkunal;

import java.util.Arrays;
import java.util.Scanner;


/*
 https://www.w3schools.com/java/ref_arrays_length.asp
 */
public class U1ClassWork1 {

    public static void main(String[] args) {

        //  decalaration and initialization
        int[] arr1 = new int[4];
        int[] arr2 = new int[]{1,2,3,4};

        int[] arr3 = {1,2,3,4};


        // decalaration
        int[] arr4 ;

        // initialization of reference code to reference variable
        arr4 = new int[4];

        System.out.println(arr4);// printing reference code


        // initialzation of single element


        arr4[0] = 4;
        arr4[1] = 3;
        arr4[2] = 2;
        arr4[3] = 1;


        // i/p and o/p
        
        // System.out.println(arr4[0]);
        
        
        Scanner sc = new Scanner(System.in);
        // arr4[2] = sc.nextInt();
        
        
        // better take with for loop

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        /*
         length is java in built property it is not related Array class nor String class
         length is int final  variable    
         */

        int max = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }
        System.out.println("Max : " + max);
        /*
 there are methods for String as it is class 
 but array is not class it is int type 
 so they  made Arrays class which they have static method like sort etc and arg is arr reference code
 */
 Arrays.sort(arr4); // sort in acending order


 for (int i = 0; i < arr4.length; i++) {
    System.out.println(arr4[i]);
 }
 
  





        sc.close();
        
    }
}