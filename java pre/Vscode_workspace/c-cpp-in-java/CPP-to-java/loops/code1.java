//// Write a program to print all the digits of a positive decimal number from right to left
/*
 Ques3. Write a program to reverse a number
E.g Given a number 1879 we need to convert it to 9781.
100020 will be converted to 20001 (Note: We need to remove the trailing zeroes).
 */
package loops;
import java.util.Scanner;
public class code1 {

    static void revserse_print(int digit){
        int rev = 0;

        while (digit > 0) {
            rev = digit%10;
            // rev = (rev * 10) + digit%10;
            System.out.print(rev);
            digit /=10;
        }

        
    }
    static int revserse_number(int digit){
        int rev = 0;

        while (digit > 0) {
            
            rev = (rev * 10) + digit%10;
            digit /=10;
        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        
        sc.close();
        // revserse_print(digit);
        
        int n_to_rev = revserse_number(digit);
        System.out.println(n_to_rev);




    }
}
