/*
 Problem 3: Managing Access Levels
Create two classes in the same package:

A BankAccount class with private fields for account number and balance.
Provide public methods to deposit, withdraw, and check balance.
Create a TestBankAccount class to use these methods.

you can add validattion
 */

package u4_practice_GPT.Bank;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private int balance;
    
    static BankAccount person[] = new BankAccount[100];
    static int counter = 1;


    BankAccount(int accountNumber, int minimumBalanace) {
        this.accountNumber = accountNumber;
        this.balance = minimumBalanace;
    }

    // 1
    public void deposit(int amount) {
        this.balance += amount;
    }

    // 2
    public void withDraw(int amount) {
        this.balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // 3
    public int getBalance(int accountNumber) {

        if (this.accountNumber == accountNumber) {

            return balance;
        }
        return 0;// wrong account number
    }
}

public class TestBankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int breakDoWhile = 0;
        do {

            System.out.println(
                    "Choose option to perform \n 1.Account Open(admin) \n 2.deposit \n 3.WithDraw \n 4.GetBalanace \n 5.Exit ");

            switch (sc.nextInt()) {
                case 1:


                    System.out.println("Set account number between 101 to 200 ");
                    int useracc = sc.nextInt();

                    System.out.println( "Set minimum balance ");
                    int miniBalance = sc.nextInt();

                    BankAccount.person[BankAccount.counter - 1] = new BankAccount(useracc, miniBalance);

                    BankAccount.counter++;
                    System.out.println("Congo you account is made you account number is : " + useracc);

                    break;

                case 2:

                    System.out.println("Enter account number  : ");
                    int accNumber = sc.nextInt();

                    System.out.println("Enter amount to deposit : ");
                    int depositAmount = sc.nextInt();
                    
                    BankAccount.person[accNumber - 101].deposit(depositAmount);
                    break;

                case 3:

                    System.out.println("Enter account number  : ");
                    int accNumber1 = sc.nextInt();

                    System.out.println("Enter amount to deposit : ");
                    int withAmount = sc.nextInt();
                    
                    BankAccount.person[accNumber1 - 101].withDraw(withAmount);
                    break;

                case 4:
                    System.out.println("Enter account number  : ");
                    int accNumber3 = sc.nextInt();
                    System.out.println(BankAccount.person[accNumber3 - 101].getBalance(accNumber3));
                    

                break;
                case 5:
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
