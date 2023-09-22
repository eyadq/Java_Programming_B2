package day11_if_statements;

public class FizzBuzz {

    public static void main(String[] args) {

        double number = 15;
        boolean isDiv3 = number%3 == 0;
        boolean isDiv5 = number%5 == 0;
        String result;

        if(isDiv3 && isDiv5){
            result = "FizzBuzz";
        } else if(isDiv3){
            result = "Fizz";
        } else if (isDiv5) {
            result = "Buzz";
        } else {
            result = "" + number;
        }
        System.out.println(result);
    }
}
