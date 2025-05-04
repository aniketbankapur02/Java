package assign1.code14;

import java.util.Scanner;

/*
Implement exponentiation (power function) manually without using Math.pow(), using
only loops and * operator.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < exp; i++) {
            ans = ans * n;
        }
        System.out.println(ans);
        sc.close();
    }
}
