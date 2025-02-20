package u2practiceset1.gpt;

import java.util.Arrays;
import java.util.Scanner;

/*
 Find the frequency of each element in an array.

Input: {1, 2, 2, 3, 3, 3, 4}
Output: {1 -> 1, 2 -> 2, 3 -> 3, 4 -> 1}
 */
public class Practice1 {
    static void countDistinctArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr); // bec of logic arr[i] != arr[i - 1]
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j] && i == 0) {
                    counter++;
                }
                if (arr[i] == arr[j] && i > 0 && arr[i] != arr[i - 1]) {// as i > 0 i wrtten before 3 rd condition so index i - 1 is not executed
                    counter++;
                }
            }
            if (counter != 0) {
                System.out.println(arr[i] + " -> " + counter);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

        countDistinctArray(arr);
        sc.close();

    }
}
