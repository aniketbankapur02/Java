// Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income Slab	Tax
// 2.5L-5.0L	5%
// 5.0L-10.0L	20%
// Above 10.0L	30%
//Note that there is no tax below 2.5L. Take income amount as an input from the user.
package Chapter_3_practice_set;

import java.util.Scanner;

public class code2 {

    
    public static void main(String[] args) {
            System.out.println("Enter the income :");
            Scanner sc = new Scanner(System.in);
            
            float income;

            income  = sc.nextInt();
            sc.close();
float tax = 0;

            if (income > 250000 && income <= 500000) {
           tax = ((income - 250000)* 5/100) ;     
                
            }
             
            if (income >  500000 && income <= 1000000) {
           tax = ((income -  500000)* 20/100) ;   
           
           tax = tax + (((500000 - 250000)* 5/100));
                
            }
             
            if (income >  1000000 ) {
           tax = ((income -  1000000) * 30/100);     
           tax = tax + (((1000000 - 500000)* 20/100));
           tax = tax + (((500000 - 250000)* 5/100));

           
           
        }
        System.out.println(tax);
             
    }
}
