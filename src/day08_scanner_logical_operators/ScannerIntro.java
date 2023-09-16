package day08_scanner_logical_operators;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("If I add three to your number, it will be: " + (3 + number) );

    }
}
