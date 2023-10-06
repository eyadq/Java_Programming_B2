package day17_loops;
   /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */

import java.util.Scanner;

/*
    repeated steps:

        ask for a number

        check is it the biggest

        check is it the smallest


 */
public class MinAndMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest = -2147483648 ; //low range of int
        int lowest = 2147483647; //high range of int

        int counter = 1;

        while (counter <= 5) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();

            if(userInput > highest){
                highest = userInput;
            }

            if(userInput < lowest){
                lowest = userInput;
            }

            counter++;
        }

        System.out.println("Max: " + highest);
        System.out.println("Min: " + lowest);
    }
}
