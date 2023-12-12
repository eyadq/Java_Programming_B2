package day09_a_scanner;

import java.util.Scanner;
public class Revenue {

    public static void main(String[] args) {

        double price = 0;
        int quantity = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a price for your product. $");
        price = input.nextDouble();

        System.out.print("Enter the quantity you wish to buy. ");
        quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.println("You will spend: $" + revenue);

    }
}
