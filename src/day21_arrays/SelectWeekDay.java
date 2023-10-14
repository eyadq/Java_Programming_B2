package day21_arrays;

import java.util.Scanner;

public class SelectWeekDay {

    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month as weekday (1 to 7): ");
        int userNumber = input.nextInt();

        if(userNumber >= 1 && userNumber <= 7){
            System.out.println("Current month is: " + weekDays[userNumber - 1]);
        } else {
            System.out.println("Sorry, invalid response");
        }

        //Extra: keep asking user for valid input until input is actually valid
    }
}
