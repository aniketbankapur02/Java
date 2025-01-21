package U1_practice_kunal;

import java.util.Scanner;

public class u1_practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println("num1 is greater");
                } else {
                    System.out.println("num4 is greater");

                }
            } else if (num3 > num4) {
                System.out.println("num3");
            }

        } else if (num2 > num3) {

            if (num2 > num4) {
                System.out.println("num2");
            } else {
                System.out.println("num4");
            }

        } else if (num3 > num4) {
            System.out.println("num3");
        } else {
            System.out.println("num4");
        }

        // if (num1>num2>num3>num4) {
        //     System.out.println("num1");
        // }else if (num2>num3>num4) {
        //     System.out.println("num2");
        // }

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }

        System.out.println("The largest number is: " + largest);
        sc.close();
    
    
    }
}
