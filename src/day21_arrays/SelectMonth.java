package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {

    public static void main(String[] args) {
        String[] months = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Septemeber",
                "October", "Novemeber", "Decemeber"};
        System.out.println(Arrays.toString(months));
        System.out.println(months.length); //12
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month as number (1 to 12): ");
        int userNumber = input.nextInt();

        if(userNumber >= 1 && userNumber <= 12){
            System.out.println("Current month is: " + months[userNumber - 1]);
        } else {
            System.out.println("Sorry, invalid response");
        }



    }
}
