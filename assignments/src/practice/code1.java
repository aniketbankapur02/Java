package practice;

import java.util.Scanner;

//even sum odd sum
public class code1 {


    public static void oddSum(int[] arr){
        int oddSum1 = 0;
        int evenSum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum1 += arr[i];
            }
            if (arr[i] % 2 == 1) {
                oddSum1 += arr[i];
            }
        }

        System.out.println("Even sum : " + evenSum1);
        System.out.println("Odd sum : " + oddSum1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        oddSum(arr);

        sc.close();
    }
}
