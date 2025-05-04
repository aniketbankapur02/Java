package assign1.code2;

import java.util.Scanner;

//Number Guessing Game
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess < number){
                System.out.println("Too low!");
            }
            else if (guess > number){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Correct!");
                break;
            }
        } while (true);

        sc.close();
    }
}
