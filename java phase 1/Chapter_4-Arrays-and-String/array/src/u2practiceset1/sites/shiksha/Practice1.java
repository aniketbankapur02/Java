package u2practiceset1.sites.shiksha;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.shiksha.com/online-courses/articles/array-programs-in-java/
 Question 3: Find the Duplicate Elements
int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
Duplicate elements: [2, 3]
 */
public class Practice1 {
        static void countDublicateElementInArr(int[] arr){
        Arrays.sort(arr); // bec of logic arr[i] != arr[i - 1]
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j] && i == 0) {
                    counter++;
                }
                if (arr[i] == arr[j] && i > 0 && arr[i] != arr[i - 1]) {// as i > 0 i wrtten before 3 rd condition so index i - 1 is not executed
                    counter++;
                }
            }
            if (counter == 2) {
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

        countDublicateElementInArr(arr);
        sc.close();

    }
}
