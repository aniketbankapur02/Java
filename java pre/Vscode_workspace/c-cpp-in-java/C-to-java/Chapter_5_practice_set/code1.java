//Use the  library function to calculate the area of a square with side a.
package Chapter_5_practice_set;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        
        // little ex to for using maths library 
        // ex 1 to generate random using maths library

        System.out.println(Math.random());// will return double in long decimal like 
        // single digit numebr will be seen as 0.01334343434434343434 multiply by 100 to get 1
        // double digit numebr will be seen as 0.10334343434434343434 multiply by 100 to get 10

        // as it is range of 0 to 1
        // we can make it to 0 to 100
        // by multiplying with 101 why 101 why not 100
        // as result of 101 will lead to 100.9999 not actual 101 that why we for range 100 we will multiply with 100
        // for range till 99 we ill multiply with 100 which result in 99.999 and we will type cast it in int so we will get 99

        int random1 = (int) Math.random() * 100;// multiply to convert 0.012323232 to 1 , 0.1000 to 10
        // above range is 0 to 99
        int random2 = ((int)(Math.random() * 100) + 1);// we can make it to 1 to 100 range by adding 1

        // coming to quiz 
        Scanner sc = new Scanner(System.in);
 System.out.println("Enter the side for calculating ");
        int side  = sc.nextInt();
        sc.close();
        int area = (int) Math.pow(side, 2);
        System.out.println(area);
        
    }
}
