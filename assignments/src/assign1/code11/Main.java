package assign1.code11;

import java.util.Scanner;

/*
Electricity Bill Calculator-Write a Java program to calculate electricity bill:
First 100 units → ₹1.5 per unit
Next 200 units → ₹2.5 per unit
Above 300 units → ₹4 per unit
Add a surcharge of ₹50 if total bill exceeds ₹500
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usage = sc.nextInt();
        double bill = 0;

        if (usage >= 1 && usage <= 100) {
         bill = usage * 1.5;
        }
       else if (usage >= 100 && usage <= 300) {
            bill = (usage - 100) * 2.5;
            bill = bill + (100 * 1.5);
        }
       else  {
        bill = (usage - 300) * 4;
        bill = bill + (100 * 1.5) + (200 * 2.5);
        }
        if (bill > 500) {
            bill += 50;
        }
 

        System.out.println(bill);
        sc.close();
    }
}

