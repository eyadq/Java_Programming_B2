package day15_string;

import java.util.Scanner;

public class TitleTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name with title: ");
        String name = input.nextLine().toLowerCase();

        if(name.startsWith("mister") || name.startsWith( "mr.")){
            System.out.println("Hello sir");
        } else if(name.startsWith("madam") || name.startsWith( "mrs.")){
            System.out.println("Hello ma'am");
        } else if(name.startsWith("dr.")){
            System.out.println("What's up doc");
        } else {
            System.out.println("There is no title");
        }

        if (name.endsWith(" sr.")) {
            System.out.println("Hello senior");
        } if (name.endsWith(" jr.")) {
            System.out.println("Hello junior");
        } else {
            System.out.println("No senior or junior");
        }




    }
}
