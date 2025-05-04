package assign1.code19;

import java.util.Scanner;

/*
Create a mini bank management system with options to deposit, withdraw, transfer,
check balance using switch-case and loops.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int amount = 0;
        boolean noExit = true;
        while (noExit) {
            System.out.println("Choose option 1) deposit 2) Withdraw 3) transfer 4) check balance 5) Exit");
            int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter amount to deposit :");
                amount = sc.nextInt();
                balance += amount;
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                } else {
                    System.out.println("insufficient balance");
                }
                break;
            case 3:
                System.out.println("Enter amount to transfer:");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                } else {
                    System.out.println("insufficient balance");
                }
                break;
            case 4:
                System.out.println("Your balance : " + balance);
                break;
            case 5 :
                System.out.println("bye");
                noExit = false;
                break;
        
            default:
            System.out.println("invalid option ");
                break;
        }

    }

        sc.close();
    }
}
