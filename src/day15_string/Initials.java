package day15_string;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter last name: ");
        String lastName = input.next();
        String initials = "";

        initials += firstName.charAt(0);
        initials += lastName.charAt(0);

        System.out.println("Your initials are " + initials.toUpperCase());
    }
}
