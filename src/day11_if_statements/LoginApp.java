package day11_if_statements;

import java.util.Scanner;

public class LoginApp {

    /*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1234
            ssn: 8213

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
    public static void main(String[] args) {

        int myPinCode = 1234;
        int mySSN = 8213;

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to ATM!\n\tPlease enter your pincode: ");
        int enteredPinCode = input.nextInt();
        System.out.print("\tWelcome! Please enter last four digits of SSN: ");
        int enteredSSN = input.nextInt();

        if(enteredPinCode==myPinCode && enteredSSN==mySSN){
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if(myPinCode!=enteredPinCode){
                System.out.println("incorrect pin code");
            }
            if(mySSN!=enteredSSN){
                System.out.println("invalid ssn");
            }
        }

    }
}
