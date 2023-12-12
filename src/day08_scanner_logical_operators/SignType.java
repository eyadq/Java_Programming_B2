package day08_scanner_logical_operators;

public class SignType {

        /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */

    public static void main(String[] args) {

        int number = 0;

        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive= number > 0;

        System.out.println("Is negative: " + isNegative);
        System.out.println("Is zero: " + isZero);
        System.out.println("Is positive: " + isPositive);

    }
}
