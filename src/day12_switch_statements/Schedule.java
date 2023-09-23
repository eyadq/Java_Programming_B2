package day12_switch_statements;

import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What day is it and what is it about?: ");
        String day = input.next();
        String result = "";

        switch(day){
            case "Monday":
                result = "No classes for now but will start soon.\nIt will be mentor sessions from 7pm-10pm EST.";
                break;
            case "Tuesday":
                result = "No classes. Champions league doing Java tasks.";
                break;
            case "Wednesday": case "Wed": case "WEDNESDAY":
            case "Thursday": case "THURSDAY":
            case "Saturday":
                result = "We are having Java classes with Feyruz.";
                break;
            case "Friday":
                result = "No classes but get ready for Saturday long hours.";
                break;
            case "Sunday":
                result = "Funday with Nadir.";
                break;
            default:
                result = "Not valid day of week.";
        }
        System.out.println(result);
    }
}
