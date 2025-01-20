package loops;

import java.util.Scanner;

public class leetcode {
    static void Pascal_triangle(int n) {
        int k = (n + n) - 1;
        int check = 1;
        int arr[][] = new int[n][k];
        System.out.print("[");

        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < k; j++) {
                if ((j >= ((k / 2) - i)) && (j <= ((k / 2) + i))) {
                    arr[i][((k / 2) - i)] = 1;
                    arr[i][((k / 2) + i)] = 1;
                    if ((j > ((k / 2) - i)) && (j < ((k / 2) + i))) {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                    }
                    if (check == 1) {
                        System.out.print(arr[i][j]);
                        check = 0;
                    } else {
                        System.out.print(",");
                        check = 1;
                    }
                } 
                // else {
                //     System.out.print(" ");
                // }
            }
            // System.out.println();
            System.out.print("]");
            check = 1;
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
 
        Pascal_triangle(n);
    }
}
