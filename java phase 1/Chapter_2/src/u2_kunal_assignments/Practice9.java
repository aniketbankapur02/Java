package u2_kunal_assignments;

import java.util.Scanner;

/*
 Java Program To Calculate Commission Percentage and Power In Java

 later
 Calculate Depreciation of Value
Calculate Batting Average
Calculate CGPA Java Program
Calculate Average Marks
Future Investment Value
 */
public class Practice9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("Enter sales");
        int sales = sc.nextInt();

        float commission = 0.05f;// 5 percent
        
        System.out.println("commision amount is : " + commission * sales);


        // 2^3
        int sq = (int)Math.pow(2,3);
        System.out.println(sq);

    }
}
