/*
 Problem 10: Real-World Use Case - Employee Bonus
Write a program that:

Calculates an employee's bonus based on performance:
Performance rating ≥ 4.5 → 20% bonus
Rating ≥ 3.5 → 10% bonus
Otherwise → 5% bonus
Use a ternary operator for the bonus calculation.
 */

package u5_part2.u2_practice_of_part2;

import java.util.Scanner;

 class Employee  {
    String empName ;
    float performanceRating;
    int salary;

    Employee(String name,float pR,int salary){
        this.empName = name;
        this.performanceRating = pR;
        this.salary = salary;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("Aniket",3.4f,10_00_000);
// if array then do alloate object via for loop and compare in loop


Employee e[] = new Employee[3];
System.out.println(" Enter employee detail name his rating his salary :");
        for (int i = 0; i < e.length; i++) {
            String empName = sc.next();
            float pR = sc.nextFloat();
            int salary = sc.nextInt();


            e[i] = new Employee(empName, pR, salary);
            // if (e1.performanceRating >= 4.5) {
            //     System.out.println("Bonus : " + e1.salary * 0.2);
            // }else if (e1.performanceRating >= 3.5){
            //     System.out.println("Bonus : " + e1.salary * 0.1);
            // }else{
            //     System.out.println("Bonus : " + e1.salary * 0.05);
            // }
        }

        // checking employee bonus individually
        for (int i = 0; i < e.length; i++) {
            if (e[i].performanceRating >= 4.5) {
                System.out.println(e[i].empName + " is Bonus : " + e[i].salary * 0.2 + " as his rating is :" + e[i].performanceRating);
            }else if (e[i].performanceRating >= 3.5){
                System.out.println(e[i].empName + " is Bonus : " + e[i].salary * 0.1 + " as his rating is :" + e[i].performanceRating);
            }else{
                System.out.println(e[i].empName + " is Bonus : " + e[i].salary * 0.05 + " as his rating is :" + e[i].performanceRating);
            }
        }

        // psuedo code using ternary operator (bonus > 4.5) ? (bous * 20%) : ((bonus > 3.5) ? bonus * 10% : bonus * 5% )

        sc.close();

    }
}
