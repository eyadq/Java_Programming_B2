package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualify {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Are you a citizen? (true or false): ");
        boolean isCitizenship = input.nextBoolean();
        System.out.print("Are you a resident? (true or false): ");
        boolean isResident = input.nextBoolean();
        System.out.print("Do you have a high school diploma? (true or false): ");
        boolean hasDiploma = input.nextBoolean();
        System.out.print("What is your age?: ");
        int age = input.nextInt();

        if(isCitizenship || isResident){
            if(age >= 18){
                if(age <= 35){
                    if(hasDiploma){
                        System.out.println("Welcome aboard!");
                    } else {
                        System.out.println("A high school diploma is required. Please apply again after obtaining one.");
                    }
                } else {
                    System.out.println("Sorry, we are currently taking applicants 35 years or younger.");
                }
            } else {
                System.out.println("Please try to apply again after turning 18.");
            }
        } else {
            System.out.println("You must be a citizen or a resident to qualify.");
        }


    }
}
