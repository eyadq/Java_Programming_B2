package day10_if_statements;

public class CheckCharacter {

        /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
     */

    public static void main(String[] args) {
        char letter = 'a';

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println("Letter " + letter + " is uppercase.");
        }
        else if (letter >= 'a' && letter <= 'z'){
            System.out.println("Letter " + letter + " is lowercase.");
        }
        else {
            System.out.println("Letter " + letter + " is not a letter.");
        }
    }
}
