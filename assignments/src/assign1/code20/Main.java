package assign1.code20;

import java.util.Scanner;

/*
Write a grade analyzer that takes multiple students' marks and classifies grades using
nested if-else
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("Student " + i + ": Grade A");
            } 
            else if (marks >= 80) {
                System.out.println("Student " + i + ": Grade B");
            } 
            else if (marks >= 70) {
                System.out.println("Student " + i + ": Grade C");
            } 
            else if (marks >= 60) {
                System.out.println("Student " + i + ": Grade D");
            } 
            else if (marks >= 50) {
                System.out.println("Student " + i + ": Grade E");
            } 
            else {
                System.out.println("Student " + i + ": Grade F (Fail)");
            }
        }
        sc.close();
    }
}
