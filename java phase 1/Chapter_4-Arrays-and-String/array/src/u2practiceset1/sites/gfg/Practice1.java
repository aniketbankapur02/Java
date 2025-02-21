package u2practiceset1.sites.gfg;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.geeksforgeeks.org/java-programming-examples/?ref=lbp#java-1d-array-programs
 Copy All the Elements of One Array to Another Array
 */
public class Practice1 {
      static void copy(int[] arr1,int[] arr2) {
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
        
        int[] arr2 = new int[arr1.length];
        System.out.println(Arrays.toString(arr1));// first three element will be replaced in array 2
        System.out.println(Arrays.toString(arr2));// first three element will be replaced in array 2
        copy(arr1,arr2);
        System.out.println(Arrays.toString(arr2));

        sc.close();

    }
}
