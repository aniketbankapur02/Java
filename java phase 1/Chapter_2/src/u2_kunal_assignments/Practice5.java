//Calculate Electricity Bill
package u2_kunal_assignments;

import java.util.Scanner;

/*
 https://www.geeksforgeeks.org/program-to-calculate-electricity-bill/
 Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges: 
 

1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit

Examples: 
 


sample input one
Input: U = 250 
Output: 3500 
Explanation: 
Charge for the first 100 units – 10*100 = 1000 
Charge for the 100 to 200 units – 15*100 = 1500 
Charge for the 200 to 250 units – 20*50 = 1000 
Total Electricity Bill = 1000 + 1500 + 1000 = 3500

sample input two
Input: U = 95 
Output: 950 
Explanation: 
Charge for the first 100 units – 10*95 = 950 
Total Electricity Bill = 950 
 
 */
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usage = sc.nextInt();
        int bill = 0;

        if (usage >= 1 && usage <= 100) {
            bill = usage * 10;
        }
       else if (usage >= 100 && usage <= 200) {
            bill = (usage - 100) * 15;
            bill = bill + (100 * 10);
        }
       else if (usage >= 200 && usage <= 300) {
            bill = (usage - 200) * 20;     
            bill = bill + (100 * 10) + (100 * 15);
        }
        else {
            bill = (usage - 300) * 25;
            bill = bill + (100 * 10) + (100 * 15) + (100 * 20);
        }

        System.out.println(bill);
        sc.close();
    }
}
