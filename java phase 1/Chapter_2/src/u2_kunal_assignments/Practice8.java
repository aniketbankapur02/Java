package u2_kunal_assignments;

import java.util.Scanner;

/*
 Program to calculate distance between two points
Last Updated : 28 Feb, 2024
You are given two coordinates (x1, y1) and (x2, y2) of a two-dimensional graph. Find the distance between them.

Examples: 

Input : x1, y1 = (3, 4)
        x2, y2 = (7, 7)
Output : 5

Input : x1, y1 = (3, 4) 
        x2, y2 = (4, 3)
Output : 1.41421

(sqrtof2(y2 - y1) + (x2 - x1))

 */
public class Practice8 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
    
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
    
    double result = Math.sqrt((int)Math.pow((y2 - y1),2) + (int)Math.pow((x2 - x1),2));

    
        System.out.println(result);
    }
}
