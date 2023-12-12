package day09_a_scanner;

import java.util.Scanner;

public class Order {
/*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

*/

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = key.nextLine();

        System.out.print("Enter price of " + productName +  ": ");
        double price = key.nextDouble();

        System.out.print("How many of " + productName +  "will be purchased: ");
        int quantity = key.nextInt();

        System.out.println("Please enter your full name: ");
        key.nextLine();
        String fullName = key.nextLine();

        String output = fullName + ", your order for " + quantity + " " + productName
                + " has been placed. Your total is " + (price * quantity);

        System.out.println(output);


    }

}
