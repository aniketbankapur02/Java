
package u1classworkunal;

import java.util.Arrays;
import java.util.Scanner;

// reverse a array using two pinter approach
public class U6ClassPractice3 {
    static void reverse(int[] arr){
        
        // for (int i = 0; i < arr.length/2; i++) {// /2 is imp else it will swap it two times it again to orignal
        //     int j = (arr.length - 1) - i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        int i = 0;
        int j = (arr.length - 1);
        // while ( i < arr.length/2) {
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        while (i < j) {// start index should be less than end index if endIndex > startINdex break it as we have travsered completely  
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    System.out.println(Arrays.toString(arr));// arrays is class and it has lot of method ot string is one of them and it takes base address of array 
    reverse(arr);
    System.out.println(Arrays.toString(arr));// arrays is class and it has lot of method ot string is one of them and it takes base address of array 

        sc.close();
    }
}
