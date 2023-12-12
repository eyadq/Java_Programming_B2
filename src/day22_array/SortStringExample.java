package day22_array;

import java.util.Arrays;

public class SortStringExample {

    public static void main(String[] args) {

        String [] arr = {"java", "api", "selenium", "database"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); //Will sort to alphabatical order of first word in each String
        System.out.println(Arrays.toString(arr)); //[api, database, java, selenium]

        System.out.println("-----------------------------");

        //Lexigraphically - in ascending order related to ASCII values
        String [] arr2 = {"java", "api", "Selenium", "12", "database", "$%"};
        Arrays.sort(arr2); // Space, Special characters, numbers, then alphabetical with uppercase having priority
        System.out.println(Arrays.toString(arr2)); // [$%, 12, Selenium, api, database, java]
    }
}
