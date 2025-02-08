package u3practicekunal;
/*
 Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
------------------------------------------------------------------
Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass.
Assume 3 subjects and take marks as input from the user.
*/

import java.util.Scanner;

public class Practice3 {

    static boolean checkresult(int sub1,int sub2,int sub3){// marks of subs
        final int TOTAL_SUBS_MARKS = 100;
        final int ALL_TOTAL_SUBS_MARKS = 300;

        float percentage1 = ((float)sub1 / TOTAL_SUBS_MARKS) * 100;
        float percentage2 = ((float)sub2 / TOTAL_SUBS_MARKS) * 100;
        float percentage3 = ((float)sub3 / TOTAL_SUBS_MARKS) * 100;
        
        if (percentage1 < 33 || percentage2 < 33 || percentage3 < 33 ) {
            return false;
        }
        float percentageTotal = ((float)(sub1 + sub2 + sub3)/ ALL_TOTAL_SUBS_MARKS)*100;

        System.out.println(percentageTotal);

        if (percentageTotal < 40 ) {
            return false;
        }

        return true;// else return true if he is not failed


    }

    static void displayResult(int marks){
        if (marks > 90 && marks < 101) {
            System.out.println("AA");
        }
      else if (marks > 80 && marks < 91) {
            System.out.println("AB");
        }
      else  if (marks > 70 && marks < 81) {
            System.out.println("BB");
        }
     else   if (marks > 60 && marks < 71) {
            System.out.println("BC");
        }
     else   if (marks > 50 && marks < 61) {
            System.out.println("CD");
        }
     else   if (marks > 40 && marks < 51) {
            System.out.println("DD");
        }
      else  if (marks > 90 && marks < 101) {
            System.out.println("Fail");
        }else{
            System.out.println("invalid marks");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // displayResult(sc.nextInt());

        System.out.println(checkresult(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        sc.close();
    }
}
