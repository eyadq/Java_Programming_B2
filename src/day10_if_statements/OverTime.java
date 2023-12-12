package day10_if_statements;

import java.util.Scanner;

public class OverTime {

            /*

        create a double variable for your hourly rate
        create a double variable for the number of hours worked

        calculate your net pay, with consideration of overtime pay

            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your hourly rate: $");
        double hourlyRate = input.nextDouble();
        System.out.print("How many hours did you work: ");
        double numHours = input.nextDouble();
        double netPay = 0;
        double overTimeHours = numHours - 40;
        netPay = 40 * hourlyRate;

        if (numHours > 40) {


            netPay += 1.5 * hourlyRate * overTimeHours;


        }
        String message = "You worked 42 hours at $60, your net pay is: $" + netPay;
        System.out.println(message);
    }
}

