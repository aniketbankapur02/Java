package u1classworkunal;

import java.util.Scanner;

// find max numbers in array
// and also find max in range 
public class U6ClassPractice2 {
    static int max(int[] arr,int index1,int index2){
        int max = 0;
        if (index1 > index2) {// index1 should be small else return -1
            return - 1;
        }
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = index1; i < index2 + 1; i++) {// or <= index2
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(max(arr,sc.nextInt() - 1,sc.nextInt() - 1));
        /*
          input is given element but index should be passed so we need tp convert index = element - 1;
         */
        sc.close();
    }
}
