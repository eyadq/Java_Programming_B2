package day12_switch_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your browser: ");
        String browser = input.nextLine();
        System.out.print("Enter your URL: ");
        //input.nextLine(); //Not needed because the proceeding scanner method was also nextLine()
        String url = input.nextLine();

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Loading...");
                break;
            case "Edge":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Welcome");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Hello");
                break;
            default:
                System.out.println(browser + " is not a valid choice.");
        }

    }
}
