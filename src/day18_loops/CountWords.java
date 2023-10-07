package day18_loops;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = input.nextLine();
        //String userSentence = "This has multiple words";

        //"This has multiple words" --> 3 spaces means 4 words

        userSentence = userSentence.trim();
        int emptySpaceCOunter = 0;
        for (int i = 0; i < userSentence.length(); i++) {
            //if character is equal to " ", increase copunter
            if(userSentence.charAt(i)  == ' '){
                emptySpaceCOunter++;
            }
        }

        System.out.println("You have " + (emptySpaceCOunter + 1) + " words");

    }
}
