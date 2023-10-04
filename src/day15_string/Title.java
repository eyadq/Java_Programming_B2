package day15_string;

import java.util.Locale;
import java.util.Scanner;

public class Title {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.next().toLowerCase();
        System.out.print("Enter your name with a title: ");
        String name = input.next();

        if(url.startsWith("www.") && url.endsWith(".com")) {
            System.out.println(name + "\nYou entered correct URL which is: " + url);
        } else {
            System.out.println("Invalid URL");
        }
    }
}
