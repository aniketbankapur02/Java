package u2practiceset1.udemy;

import java.util.Arrays;
import java.util.Scanner;

/*
below is of O(n^2) i have to do in O(n)
Coding Exercise: Find Second Largest Element

 Input: nums = [12, 35, 1, 10, 34, 1]  
Output: 34  
Explanation: The largest element is 35, and the second largest is 34.  

Input: nums = [10, 10, 10]  
Output: -1  
Explanation: All elements are the same, so there is no second largest element.  

Input: nums = [5, 7, 8, 9, 5]  
Output: 8  
Explanation: The largest element is 9, and the second largest is 8.  
 */
public class Practice1 {

    static int findSecondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int seconLargest = arr[i];
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {

                if (seconLargest < arr[j]) {// get min
                    counter++;
                }
            }
            if (counter == 1) {// second largest element is only one(counter) time minimum than largest
                return seconLargest;
            }
        }
        return -1;
    }

    static int findSecondLargest2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            int seconLargest = arr[i];

            if (seconLargest < arr[j]) {// get min
                counter++;
            }

            if (counter == 1) {// second largest element is only one(counter) time minimum than largest
                return seconLargest;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondLargest(arr));

        sc.close();

    }
}
