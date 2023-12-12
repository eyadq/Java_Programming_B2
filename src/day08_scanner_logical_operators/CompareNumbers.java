package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber = input.nextInt();

        System.out.println("Numbers are equal? " + (firstNumber == secondnumber));

    }
}
