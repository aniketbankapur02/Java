//Create a class representing a bank account of a customer. What fields did you use and why?

package Chapter_9_practice_set;

import java.util.Scanner;

class bank {
    // registration section in bank
    private int customer_id;
    private int account_no;//no given by bank to user after registration
    private String name;
    
    // amount deposit section
    private int amount;

    bank(int customer_id, int account_no,String name) {
        this.customer_id = customer_id;
        this.account_no = account_no;
        this.name = name;
    }

    public int getaccount_no() {
        return account_no;
    }

    void deposit(int amount, int account_no) {

        System.out.println("dear "+name+" your acccount XX" + account_no % 10 + " is credited by " + amount);
        this.amount = this.amount + amount;
        System.out.println("current balance is " + this.amount);

        // if (this.account_no == account_no) {
        //     System.out.println("dear customer your acccount XX" + account_no % 10 + " is credited by " + amount);
        //     this.amount += amount;
        //     System.out.println("current balance is " + amount);
        // } else {
        //     System.out.println("wrong account number please enter correct account number");
        // }
    }

    void debit(int amount, int account_no) {
        if ((this.amount -= amount) < 0) {
            System.out.println("payment failed due to low amount");
            System.out.println("current balance is " + this.amount);

        } else {
            System.out.println("dear "+name+" your acccount XX" + account_no % 10 + " is debited by " + amount);
            System.out.println("current balance is " + this.amount);
        }

        // if (this.account_no == account_no) {
        //     // this.amount -= amount;
        //     if ((this.amount -= amount) < 0) {
        //         System.out.println("payment failed due to low amount");
        //     } else {
        //         System.out.println("dear customer your acccount XX" + account_no % 10 + " is debited by " + amount);
        //         System.out.println("current balance is " + amount);
        //     }

        // } else {
        //     System.err.println("wrong account number please enter correct account number");
        // }
    }

    void display_amount(int account_no) {

        // this error handling of acc_no (validation) is not validated  accn to user
        // if account number exist amount will be transfered to that account number
        // if account is not there then will validate and tell this account does not exist  
        // if (this.account_no == account_no) {

            System.out.println("current balance is " + amount);

        // } else {
            // System.err.println("wrong account number please enter correct account number");
        // }


    }

}

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank person[] = new bank[100];//limit of 100 account
        int counter = 0;
        boolean not_end = true;
        do {

            System.out.println(
                    "choose option to perform \n 1) create account \n 2) depoist (via cash in bank or UPI) \n 3) debit amount no OTP (atm or via bank slip) \n 4) display amount (atm) \n 5) exit");
            int choosed = sc.nextInt();
            switch (choosed) {
                case 1:
                    System.out.println("Enter the your name ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    person[counter] = new bank(counter + 1, 100 + (counter + 1),name);
                    System.out.println("account created successfully your account is "+ person[counter].getaccount_no());
                    counter++;

                    break;

                case 2: {
                    System.out.println("Enter amount and account number to deposit");
                    int amount = sc.nextInt();
                    int account_no = sc.nextInt();
                    if (account_no < 101 || account_no > 200) {// error handling for array out of bound we are not making account number less than 101
                        System.err.println("There is no customer Account number please enter correct account number limit issues");
                        break;
                    }
                    if (person[account_no - 101] != null) {

                        person[account_no - 101].deposit(amount, account_no);
            
                    } else {
                        System.err.println("There is no customer for this Account number please enter correct account number ");
                    }
                    // person[account_no - 101].deposit(amount, account_no);
                }
                    break;

                case 3:

                {
                    System.out.println("Enter amount and account number to debit/pay");
                    int amount = sc.nextInt();
                    int account_no = sc.nextInt();
                    // if (account_no > 101 && account_no < 200)
                    if (account_no < 101 || account_no > 200) {// error handling for array out of bound we are not making account number less than 101
                        System.err.println("There is no customer for this Account number please enter correct account number limit issues");
                        break;
                    }
                    if (person[account_no - 101] != null) {

                        person[account_no - 101].debit(amount, account_no);
            
                    } else {
                        System.err.println("There is no customer for this Account number please enter correct account number");
                    }

                    //person[account_no - 101].debit(amount, account_no);
                }
                    break;
                case 4:
                System.out.println("Enter account number to diaplay amount");
                int account_no = sc.nextInt();
                if (account_no > 101 && account_no < 201) {// error handling for array out of bound we are not making account number less than 101
                    System.err.println("There is no customer Account number please enter correct account number");
                    break;
                }
                if (person[account_no - 101] != null) {

                    person[account_no - 101].display_amount(account_no);
        
                } else {
                    System.err.println("There is no customer Account number please enter correct account number");
                }
                   // person[account_no - 101].display_amount(account_no);
                    break;

                case 5:
                    // return;
                    not_end = false;
                    break;

                default:
                    System.out.println("Please choose valid option ");
                    break;
            }
        }while (not_end);

        sc.close();

        // bank person1 = new bank(1, 111);
        // System.out.println(person1.display_amount());

        // System.out.println("Enter amount and account number to deposit");
        // int amount = sc.nextInt();
        // int account_no = sc.nextInt();

        // person1.display_amount(111);
        // person1.deposit(100, 111);
        // person1.display_amount();
        // person1.debit(50, 111);
        // person1.display_amount();

    }
}

/*
 class BankAccount {
    // Fields
    private String accountNumber; // Unique identifier for the account
    private String accountHolderName; // Name of the account holder
    private double balance; // Current balance in the account
    private String accountType; // Type of account (e.g., Savings, Checking)
    private String branchName; // Branch where the account is maintained

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, String accountType, String branchName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.branchName = branchName;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranchName() {
        return branchName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0, "Savings", "Downtown Branch");

        // Display account details
        account.displayAccountDetails();

        // Deposit money
        account.deposit(500);

        // Withdraw money
        account.withdraw(300);

        // Display updated account details
        account.displayAccountDetails();
    }
}

 */
