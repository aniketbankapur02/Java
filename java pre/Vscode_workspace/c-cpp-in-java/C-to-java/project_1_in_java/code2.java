package project_1_in_java;


    // Problem: This is going to be fun!!  We will write a program that generates a random number and asks the player to guess it. If the player’s guess is higher than the actual number, the program displays “Lower number please.” Similarly, if the user’s guess is too low, the program prints “Higher number please.”

// When the user guesses the correct number, the program displays the number of guesses the player used to arrive at the number.

// Hints:

// Use loops
// Use a random number generator.



import java.util.Random;
import java.util.Scanner;

public class code2 {

    static void game_method( Scanner sc){
        
       

        Random ran_num = new Random();
        int Random_number = ran_num.nextInt(100) + 1;
      
        int user_guess;
        int counter = 1;
        do {
            System.out.println("guess the random number");
            user_guess = sc.nextInt();

            if (user_guess > Random_number) {
                System.out.println("Lower number please");
             
            }else if (user_guess < Random_number) {
                System.out.println("Higher number please");
            }else{
                System.out.println("your guess is correct."+" The number is "+Random_number+" and you have taken "+counter+" attempts");
            }
            
            counter++;
        } while (user_guess != Random_number );

    }

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
                
        
        do {
            game_method(sc);
            System.out.println("To play again Enter Y to Exit Enter N :");
        } while (sc.next().equalsIgnoreCase("Y"));

        sc.close();

    }

}


