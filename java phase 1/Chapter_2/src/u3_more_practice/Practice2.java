package u3_more_practice;

import java.util.Scanner;

//  Coding Exercise: Sum of Squares of First N Numbers

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);

        System.out.println("-----mul sum");

        int n2 = sc.nextInt();
        int sum2 = 0;

        for (int i = 1; i <= n2; i++) {
            sum2 = sum2 + i * 2;// 2 table
        }
        System.out.println(sum2);

        

        sc.close();
    }
}
