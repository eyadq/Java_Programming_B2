package day09_b_if_statements;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature (f): ");
        int temp = input.nextInt();

        boolean isNice = temp >= 70;

        if(isNice){
            System.out.println("It is a nice day.\nGo outside, but take your laptop to code Java");
        } else {
            System.out.println("It's too cold.\nCode more Java.");
        }
    }
}
