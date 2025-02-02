package u2_kunal_assignments;

import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers 
//from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.
public class Practice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNegatve = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter the N natural number and to exit press 0");
        while (true){
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sumNegatve = sumNegatve + n;
            }else{// why else bec negative evens will be added to positive even we to have to add only positive evens 

                if (n % 2 == 0) {
                    sumEven = sumEven + n;
                }
                if (n % 2 == 1) {
                    sumOdd = sumOdd + n;
                }
            }

        }
        System.out.println("Sum negative " + sumNegatve + " \nSum even positive " + sumEven + " \nSum odd positive " + sumOdd);


        sc.close();
    }
}
// if (n == 0) {
//     break;
// }
// if (n < 0) {
//     sumNegatve = sumNegatve + n;
// }
// negative number will not enter else if 
// // why else if bec negative evens will be added to positive even we to have to add only positive evens 
//   else  if (n % 2 == 0) {
//         sumEven = sumEven + n;
//     }
//    else if (n % 2 == 1) {
//         sumOdd = sumOdd + n;
//     }


// while (true){
//     int n = sc.nextInt();
//     if (n == 0) {
//         break;
//     }
//     n = -n;
//     sumNegatve = sumNegatve + n;
//     n = -n;
//     if (n % 2 == 0) {
//         sumEven = sumEven + n;
//     }
//     if (n % 2 == 1) {
//         sumOdd = sumOdd + n;
//     }

// }