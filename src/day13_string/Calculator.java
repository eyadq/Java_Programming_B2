package day13_string;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Pick Operator: \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();
        boolean shouldRun = true;

        int result = 0;
        String message = "";
        switch(operator){
            case "+": case "plus":
                result = num1 + num2;
                break;
            case "-": case "minus":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                message = "Invalid operator";
                shouldRun = false;
        }

        if(shouldRun){
            System.out.println("You entered numbers which are " + num1 + " and " + num2 + "\nWith operator you selected " +
                    operator + ", result is " + result);
        } else {
            System.out.println(message);
        }



    }
}
