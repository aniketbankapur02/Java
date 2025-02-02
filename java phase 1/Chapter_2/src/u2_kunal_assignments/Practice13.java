package u2_kunal_assignments;
// Find if a number is palindrome or not

import java.util.Scanner;

/*
 if rev == original then palidrome else not
 */
public class Practice13 {
static void checkNumPalindrome(int n){
    int original = n;
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }

    if (original == rev) {
        System.out.println("palindrome");
    }else{
        System.out.println("Not palidrome");
    }
}

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number  : ");

checkNumPalindrome(sc.nextInt());
sc.close();
 }
}
