package day25_methods;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WHat year were you born: ");
        int birthYear = input.nextInt();
        calculatedAge(birthYear);

        //Can you handle invalid user input - anything more than 2023



    }

    public static void calculatedAge(int birthYear){
        if(birthYear > 2023){
            System.out.println("You haven't been born yet");
        } else {
            System.out.println("Your age: " + (2023 - birthYear));
        }
    }
}
