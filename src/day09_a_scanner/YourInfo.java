package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        byte age = 0;
        long favoriteNumber = 0;
        String favoriteBook = "default";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextByte();
        System.out.print("Enter your favorite number: ");
        favoriteNumber = input.nextLong();
        input.nextLine(); //The following nextLine() was being skipped without this nextLine() being here
        System.out.print("Enter your favorite book: ");
        favoriteBook = input.nextLine();


        System.out.println("Your age: " + age);
        System.out.println("Your favorite number: " + favoriteNumber);
        System.out.println("Your favorite book: " + favoriteBook);
    }
}
