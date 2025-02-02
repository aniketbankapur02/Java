package u2_kunal_assignments;

import java.util.Scanner;

// Calculate Average Of N Numbers
// n numbers we have to take n numbers from user
// to optimize space this solution we are not using array
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float ans = 0;
        int counter = 0;
        while (true) {
                System.out.println("Enter N natural numbers and press 0 to exit  ");
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                ans += n;
                counter++;       
            }

System.out.println(ans/counter);
        sc.close();
    
    }
}



        // while (true) {
        //     System.out.println("to give input press A to stop input press X");
        //     char c = sc.next().charAt(0);
        //     float ans = 0;
        //     if (c == 'x' || c == 'X') {
        //         break;
        //     }else if( c == 'A' || c == 'a'){
        //         System.out.println("Enter N numbers");
        //         int n = sc.nextInt();
        //         if (ans == 0) {
        //             ans = (ans + n);
                    
        //         }else{
        //             ans = (ans + n)/2;
        //         }
            
        //     }else{
        //         System.out.println("Invalid option");
        //     }
            
        // }