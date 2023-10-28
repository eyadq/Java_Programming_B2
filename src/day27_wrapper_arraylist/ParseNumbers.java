package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {

    public static void main(String[] args) {

        String year = "2023";

        int year1 = 2023;
        Integer year2 = 2023;  // Autoboxing from -> int -> Integer
        Integer year3 = year1; // Autoboxing from -> int -> Integer

        System.out.println("Current year: " + year1);
        System.out.println("Next year: " + year1 + 1);

        System.out.println("Current year: " + year);
        System.out.println("Next year: " + (year + 1));

        //Convert a String number into int
        int intFromString = Integer.parseInt("5");
        System.out.println(intFromString);

        //Now fix the above
        System.out.println("Current year: " + year);
        System.out.println("Next year: " + (Integer.parseInt(year) + 1));

        //The following code causes an exception: NumberFormatException
        //We cannot convert non-numerical characters into numbers
        //String strNum = "2023Y";
        //int num2 = Integer.parseInt(strNum);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String response = input.nextLine(); //"I am 5 years old"

        int age = Integer.parseInt(response.split(" ")[2]);
        System.out.println(age);

        System.out.println("In five year you will be " + (age + 5) + " years old.");

    }
}
