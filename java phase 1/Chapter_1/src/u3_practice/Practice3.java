package u3_practice;

/*
Login System: Write a program that asks for a username and password. Validate the input against pre-defined values.
Shopping Cart Total: Develop a program to calculate the total cost of items in a shopping cart, including tax (use constants for tax rate).

Login System Validation
Problem Statement:
Write a function to validate a username and password against predefined credentials. The valid username is "admin" (case-sensitive), and the valid password is "secure123" (case-sensitive). Ignore any leading or trailing whitespace in the input, but the processed input must match the predefined values exactly.

Examples:

Input: username = " admin ", password = "secure123"
Output: True  # Stripped to "admin" and "secure123"

Input: username = "Admin", password = "Secure123"
Output: False  # Incorrect case in username and password

Input: username = "guest", password = "password"
Output: False  # Neither matches
Constraints:

0 <= len(username), len(password) <= 100

Inputs may contain leading/trailing whitespace.

problem faced 
how to know whether user has done his registration or it is invalid username
take hellp of other fields like id wheather he has registered or not
*/


import java.util.Scanner;

class Emp {
   // database fields
   int id;
   String username;
   String password;

   Emp(int id, String username, String password) {
       this.id = id;
       this.username = username;
       this.password = password;
   }
}

class EmpDatabase {

   static int counter = 1;
   static int MAX = 100; // 100 rows

   // employee table
   static Emp e[] = new Emp[MAX];// 100 rows is allocated with null values

   // update datbase records
   // get data method
   // delete data

   static void iniDatabase() {
       for (int i = 0; i < MAX; i++) {
           e[i] = new Emp(0, "null", "null");
       }
   }

   void display(int id) {
       System.out.println(e[id - 1].username);// index = id - 1;
   }
}

class AuthSystem {

   static void empSignUp(String username, String password) {

       EmpDatabase.e[EmpDatabase.counter - 1] = new Emp(EmpDatabase.counter, username, password);// entry in row //
                                                                                                 // register in
                                                                                                 // database
       System.out.println("Successfully register" + " your id is : " + EmpDatabase.e[EmpDatabase.counter - 1].id);// get
                                                                                                                  // id
                                                                                                                  // for
                                                                                                                  // that
                                                                                                                  // index
       EmpDatabase.counter++;

       if (EmpDatabase.counter > EmpDatabase.MAX) {
           System.out.println("No more signups");
           return;
       }

   }

   static int signIN(String username, String password) {// passValidate and then give entry

       int check = 0;

       for (int i = 0; i < EmpDatabase.MAX; i++) { // you can even keep data private and implement getMethod();

           // if (EmpDatabase.e[i].id < 1) {
           // return 112; // this means there is no entry for this user as id is less than
           // 1 ie 0
           // // if entry is made then id is something > 0 this if will not run
           // }

           // above rhing works when you consider id for login
// try without signup and with signup but wrong name
           // if ((!(EmpDatabase.e[i].username.equals(username)) && EmpDatabase.e[i].id < 1) || !EmpDatabase.e[i].username.equals("null")) {
           //     return 112; // this means there is no entry for this user as user name is null
           //     // if entry is made then username is something other than null
           // } 
         

               if (EmpDatabase.e[i].username.equals(username) && EmpDatabase.e[i].id > 0) { // take id as well
                   check = 1;// means user name is valid and he is registred as ID is greater than 1


                   if (EmpDatabase.e[i].password.equals(password)) {
                       return 1;
                   } else {
                       return 111;// wrong password
                   }
  
               }
           }
       

       // if (check == 0) {
       // return 0; //as check is still 0 it so invalid username
       // }

       return check;// if code comes here means user name is not valid as we traverse all records

   }

}

public class Practice3 {

   // console UI
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       EmpDatabase.iniDatabase();
       ;
       int breakDoWhile = 0;
       do {

           System.out.println("Choose option to perform \n 1.Sign Up \n 2.Login \n 3.Get username \n 4.Exit ");

           switch (sc.nextInt()) {
               case 1:
                   System.out.println("Set your name (No space in between) ");
                   String userName = sc.next();

                   System.out.println(
                           "Set your password (No space in between must contain one uppercase,special char,8 char) ");
                   String userPassword = sc.next();

                   AuthSystem.empSignUp(userName, userPassword);
                   break;

               case 2:
                   int k;
                   do {

                       System.out.println("Enter  name (No space in between) ");
                       String userNameLogin = sc.next();

                       System.out.println("Enter your password");
                       String userPasswordLogin = sc.next();

                       k = AuthSystem.signIN(userNameLogin, userPasswordLogin);

                       if (k == 1) {
                           System.out.println("Successfully log in");
                           break;
                       } else if (k == 0) {
                           System.out.println("invalid username");
                           break;
                       } else if (k == 112) {
                           System.out.println("username not found please signup");
                           break;
                       } else {
                           System.out.println("password failed try again");
                       }

                   } while (k == 0);// works untill password matchs
                   break;

               case 3:
                   EmpDatabase empp = new EmpDatabase();
                   System.out.println("Enter your id");
                   empp.display(sc.nextInt());
                   break;

               case 4:
                   breakDoWhile = 1;// breaks do while
                   break;

               default:
                   System.out.println("invalid options choose again");
                   break;
           }

       } while (breakDoWhile == 0);

       sc.close();
   }
}
