package assign1.code27;

import java.util.Scanner;

/*
Implement a method to validate a strong password (must contain uppercase, lowercase,
digit, special character).
 */
public class Main {
    static void validatePassword(String password) {
      boolean upper = false, lower = false, digit = false, special = false;
      for (int i = 0; i < password.length(); i++) {
         if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
            lower = true;
         }else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
            upper = true;
         } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
            digit = true;
         }
         else {
            special = true;
         }
      }
      if(upper && lower && digit && special && password.length() >= 8){
         System.out.println("Strong");
      }else{
         System.out.println("Not Strong passowrd");
      }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        validatePassword(password);
        sc.close();
     }
}