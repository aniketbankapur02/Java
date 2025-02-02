package u2_kunal_assignments;

import java.util.Scanner;

/*
 Kunal is allowed to go out with his friends only on the even days of a given month. 
 Write a program to count the number of days he can go out in the month of August.
 */
public class Practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 31;
        int counter = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Kunal can play only " + counter + " days in the month of auguest ");
    }
}
