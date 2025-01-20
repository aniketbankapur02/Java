// Problem: This is going to be fun!!  We will write a program that generates a random number and asks the player to guess it. If the player’s guess is higher than the actual number, the program displays “Lower number please.” Similarly, if the user’s guess is too low, the program prints “Higher number please.”

// When the user guesses the correct number, the program displays the number of guesses the player used to arrive at the number.

// Hints:

// Use loops
// Use a random number generator.

package project_1_in_java;

import java.util.Random;
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Random ran_num = new Random();

        Scanner sc = new Scanner(System.in);
        
        
        
        int Random_number = ran_num.nextInt(100) + 1;
        int game_play = 1;
        int counter = 1;
        do {
            int user_guess;
            System.out.println("guess the random number");
            user_guess = sc.nextInt();

            if (user_guess > Random_number) {
                System.out.println("Lower number please");
                counter++;
            }else if (user_guess < Random_number) {
                System.out.println("Higher number please");
                counter++;
            }else{
                System.out.println("your guess is correct."+" The number is "+Random_number+" and you have taken "+counter+" attempts");
                System.out.println("To play again Enter Y to Exit Enter N :");
                char wanna_play_again = sc.next().charAt(0);
                if ((wanna_play_again == 'Y') || (wanna_play_again == 'y')) {
                    game_play = 1;
                    //as player choosed to play again reset the metrics
                    Random_number = ran_num.nextInt(100) + 1;
                    counter = 1;
                } else {
                    game_play = 0;
                }
            }
            
        } while (game_play != 0);

        sc.close();

    }

}
