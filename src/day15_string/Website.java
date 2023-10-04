package day15_string;

import java.util.Scanner;

public class Website {
/*    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");  // www.google.com
        String url = input.next();            // 0123456789123
        //works for www.google.com but not every website
        String result = "" + url.charAt(4) + url.charAt(5) + url.charAt(6) + url.charAt(7) + url.charAt(8) +
                url.charAt(9);
        System.out.println(result);

        //substring works for all websites
        int startPoint = url.indexOf(".") + 1;
        int endPoint = url.length() - 4;
        result = url.substring(startPoint, endPoint);
        System.out.println(result);

    }

}
