package assign1.code18;

import java.util.Scanner;

/*
Number Guessing Game with Difficulty Levels
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (Math.random() * 100);

        System.out.println("Choose difficulty: 1. Easy (10 tries), 2. Medium (7 tries), 3. Hard (5 tries)");
        int level = sc.nextInt();
        int attempts = 0;
        switch (level) {
            case 1:
                attempts = 10;
                break;
            case 2:
                attempts = 7;
                break;
            case 3:
                attempts = 5;
                break;
            default:
                break;
        }

        if (attempts == 0) {
            System.out.println("Invalid level.");
            return;
        }

        while (attempts > 0) {
            System.out.print("Guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct!");
                return;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
        }

        System.out.println("Out of attempts! The number was " + number);
        sc.close();
    }
}
