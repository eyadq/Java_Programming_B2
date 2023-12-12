package day11_if_statements;

public class TernaryExample {

    public static void main(String[] args) {

        int a =4;
        String evenOrOdd = "";
        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }

        //In Java, there is shorted SYNTAX version of if else
        evenOrOdd = (a % 2 == 0) ? "Even": "Odd";
        /*
        (a % 2 == 0)    ----->          condition
         ?              ----->          means to check true or false
         "Even"         ----->          what evenOrOdd will be if the condition is true
         :              ----->           "else"
         "Odd"          ----->          what evenOrOdd will be if the condition is false

         The two values must be of the same type
         */

        int num =4;
        String result = (num > 10)? "BiggerThanTen" : "NotBiggerThanTen";

        int number = -4;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        //String sign = (number > 0) ? "positive" : "negative";
    }
}
