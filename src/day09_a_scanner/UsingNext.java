package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is today? ");
        String day = input.nextLine();
        System.out.print("Enter your first name: ");
        String name = input.nextLine();

        System.out.println("Today: " + day);
        System.out.println("Name: " + name);

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Enter your address: ");
        input.nextLine(); //next nextLine() does not work without this line
        String address = input.nextLine();

        System.out.println("Last name: " + lastName);
        System.out.println("address: " + address);



    }
}
