package day09_b_if_statements;

public class SingleIfExample {

    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello world"); //since our condition is false, code block is skipped
            System.out.println("Second line"); //all of these lines will be skipped
        }

        System.out.println("This is outside of the if statement");


        int score = 60;

         if (score >= 75){
             System.out.println("You passed the exam");
         }

        if (score < 75){
            System.out.println("You failed the exam");
        }

        int year = 2021;
        boolean isLockdown = year == 2020 || year == 2021;
        if(isLockdown){
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study, put your mask on");
        }

        if(!isLockdown){
            System.out.println("Party");
            System.out.println("This is not a normal party. It is a Java Party.");
            System.out.println("Travel");
        }

    }

}
