package u2_kunal_assignments;
//// 10. Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do while approach
        int n = 0;
        int tempMax = 0;

        while (true) {
            n = sc.nextInt();
            // store max vaue to check who is maximum for each iteration 
            if (n == 0) {
                break;
            }

            if (n > tempMax) {
                tempMax = n;
            }
        }

        System.out.println(tempMax);
        sc.close();
    }
}
