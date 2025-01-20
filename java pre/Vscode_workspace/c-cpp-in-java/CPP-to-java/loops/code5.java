// Pascal Triangle
// https://en.wikipedia.org/wiki/Pascal%27s_triangle
package loops;

import java.util.Scanner;

public class code5 {
    static void triangle1(int n) {
        int k = (n + n) - 1;
        int check = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if ((j >= ((k / 2) - i)) && (j <= ((k / 2) + i))) {
                    if (check == 1) {
                        System.out.print("*");
                        check = 0;
                    }

                    else {
                        System.out.print(" ");
                        check = 1;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            check = 1;
        }
    }

    // static void triangle(int n) {
    //     int k = (n + n) - 1;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < k; j++) {
    //             if ((j >= ((k / 2) - i)) && (j <= ((k / 2) + i))) {
    //                 if ((k / 2)%2 == 1) {

    //                     if ((i % 2 == 0) && (j % 2 == 1)) {
    //                         System.out.print("*");
    //                     } else if ((i % 2 == 1) && (j % 2 == 0)) {
    //                         System.out.print("*");

    //                     } else {
    //                         System.out.print(" ");
    //                     }
    //                 } else {
    //                     if ((i % 2 == 0) && (j % 2 == 0)) {
    //                         System.out.print("*");
    //                     } else if ((i % 2 == 1) && (j % 2 == 1)) {
    //                         System.out.print("*");

    //                     } else {
    //                         System.out.print(" ");
    //                     }
    //                 }
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    static void Pascal_triangle(int n) {
        int k = (n + n) - 1;
        int check = 1;
        int arr[][] = new int[n][k];
        for (int i = 0; i < n; i++) {
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
                        System.out.print(" ");
                        check = 1;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            check = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
        triangle1(n);
        Pascal_triangle(n);
        // int arr[][] = new int[n][m];
    }
}
