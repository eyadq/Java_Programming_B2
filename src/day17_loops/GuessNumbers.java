package day17_loops;

import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 77;
        int guess = 0;

        do{
            System.out.print("Guess a number from 1 to 100: ");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println("Your guess is too large, try a smaller number.");
            }
            if(guess < secretNumber){
                System.out.println("Your guess is too small, try a larger number.");
            }

        } while (guess != secretNumber);

        System.out.println("You guessed correct");
    }
}
