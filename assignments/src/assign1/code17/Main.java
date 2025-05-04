package assign1.code17;

import java.util.Scanner;

/*
 Write a Java program that simulates a vending machine with nested switch-cases.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category: 1. Drinks 2. Snacks");
        int category = sc.nextInt();

        switch (category) {
            case 1:
                System.out.println("1. Tea 2. Coffee");
                int drink = sc.nextInt();
                switch (drink) {
                    case 1: System.out.println("You selected Tea"); break;
                    case 2: System.out.println("You selected Coffee"); break;
                    default: System.out.println("Invalid drink");
                }
                break;
            case 2:
                System.out.println("1. Chips 2. Biscuits");
                int snack = sc.nextInt();
                switch (snack) {
                    case 1: System.out.println("You selected Chips"); break;
                    case 2: System.out.println("You selected Biscuits"); break;
                    default: System.out.println("Invalid snack");
                }
                break;
            default:
                System.out.println("Invalid category");
        }
        sc.close();
    }
}
