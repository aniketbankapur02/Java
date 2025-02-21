package u2practiceset1.sites.programiz;

import java.util.Arrays;
import java.util.Scanner;

// Java Program to Concatenate Two Arrays
// i am not using third array
// also inout is not allowed 
public class Practice1 {
      static void con(int[] arr1,int[] arr2) {
        // int j = arr1.length;
        // int k = arr2.length - arr1.length;
       for (int i = 0; i < arr1.length; i++) {
        arr2[i] = arr1[i];
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n1 + n2];

        /*
         if first array  is of size 3
         and array 2 is of size 2 then array 2 will be of 5
         so we have to assign from 3 index (4 th element)
         */
        for (int i = arr1.length; i < n1 + n2; i++) {// assign from middle
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));// first three element will be replaced in array 2
        con(arr1,arr2);
        System.out.println(Arrays.toString(arr2));

        sc.close();

    }
}
