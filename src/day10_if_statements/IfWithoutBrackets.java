package day10_if_statements;

public class IfWithoutBrackets {

    public static void main(String[] args) {

        if (4 > 2) {
            System.out.println("Hello"); //Don't need {} if code block has one line
            System.out.println("Bye");
        }

        if (4 > 2)
            System.out.println("Hello Again!"); //Don't need {} if code block has one line

        if (2 > 4)
            System.out.println("If this line prints, we are not friends!!"); //Don't need {} if code block has one line
            System.out.println("This is actually outside of the if block"); //Can't have multiple lines without {}

    }
}
