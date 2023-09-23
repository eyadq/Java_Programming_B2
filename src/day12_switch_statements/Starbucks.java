package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {

    /*

Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

At the end print the details of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */

    public static void main(String[] args) {

        double price = 0;
        double calories = 0;
        String size = "";

        Scanner input = new Scanner(System.in);
        System.out.print("What size drink would you like?: (tall/grande/venti) ");
        size = input.next();

        boolean isValid = true;

        switch(size){
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We do not have that size");
                isValid = false;
        }

        if(isValid){
            System.out.println(price);
            System.out.println(calories);
        }

    }
}
