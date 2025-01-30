package u1_control_statements_kunal;

import java.util.Scanner;

// Calculator program 
// take input until user press x or X
public class ClassPracticeQuestions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // while (true) {
            //     System.out.println(
                //             "Perform what you want to do \n 1) Addition 2) Substraction 3) multiplication  4) press x or X to exit");
                
                //     int i = sc.next().charAt(0);
                
                //     if (i == 'X' || i == 'x') {
                    //         break;
                    //     }
                    // }
                    
                    while (true) {
            System.out.println("Your home Calculator program !!! press A to start or press X or X to exit ");
  char i = sc.next().charAt(0); // you do int as well 
            if (i == 'A' || i == 'a') {
                System.out.println("Enter operand1 :");
                int a = sc.nextInt();
    
                System.out.println("Enter operator :");
                char b = sc.next().charAt(0);
    
       
                System.out.println("Enter operand2 :");
                int c = sc.nextInt();
    
                // char i = sc.next().charAt(0); // you do int as well 
    
                if (c == 'X' || c == 'x') {
                    break;
                }
    
                if (b == '+') {
                    System.out.println(" result " + a + c);
                }
                if (b == '-') {
                    System.out.println(" result " + (a - c));
                }
                if (b == '*') {
                    System.out.println(" result " + a * c);
                }
                if (b == '/') {
                    if (c == 0) {// imp egde case to handle
                        System.out.println("operand 2 cannot be 0 in case of divide");
                        continue;
                    }
                    System.out.println(" result " + a / c);
                }
                
            }else if(i == 'X' || i == 'x'){
                break;
            }else{
                System.out.println("Invalid option");
            }

            
        }
           // or this approach
        while (true) {
        
            System.out.println("Enter operator : to perform operation or X / x to exit");
            char b = sc.next().charAt(0);
            if (b == '+' || b == '-' || b == '*' || b == '/') {
                System.out.println("Enter operand1 :");
                int a = sc.nextInt();
    

    
       
                System.out.println("Enter operand2 :");
                int c = sc.nextInt();
    
                // char i = sc.next().charAt(0); // you do int as well 
    
                if (c == 'X' || c == 'x') {
                    break;
                }
    
                if (b == '+') {
                    System.out.println(" result " + a + c);
                }
                if (b == '-') {
                    System.out.println(" result " + (a - c));
                }
                if (b == '*') {
                    System.out.println(" result " + a * c);
                }
                if (b == '/') {
                    System.out.println(" result " + a / c);
                }
                
            }else if(b == 'X' || b == 'x'){
                break;
            }else{
                System.out.println("Invalid option");
            }

            
        }
    }
}
