package u2practiceset1.gfg;
//  Find Average of array

import java.util.Scanner;

public class Practice1 {
    static  float avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (float)sum/arr.length;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];// you can take input size from user size will not break in runtime as memory allocation is in heap not in stack so no stack overflow 
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(avg(arr));

    sc.close();

}    
}
