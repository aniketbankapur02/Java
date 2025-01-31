package u2_kunal_assignments;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do while approach
        int n,sum = 0;
        // do {
        //     n = sc.nextInt();
        //     sum += n;
        // } while ((n != 0));

        // while (true) {
        //     n = sc.nextInt();
        //     if (n == 0) {
        //         break;
        //     }
        //     sum += n;

        // }

        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
sum = 0;// reset for second use
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);

        }

        // System.out.println(sum);
    }
}
