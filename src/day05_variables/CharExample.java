package day05_variables;

public class CharExample {

    public static void main(String[] args) {
        //assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne + letterTwo); // Prints 187 (because 97 + 90)

        char letterThree = 65;
        System.out.println(letterThree); //Prints A

        // char letterFour = '65'; //Illegal as a char can only be single character

        //Concatenation
        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne);

        //Concatenation
        System.out.println("Chars: " + letterOne + letterTwo + letterThree + numberOne  + specialOne);

        //Concatenation starts from first string
        // Output: 187Chars: A9$
        System.out.println(letterOne + letterTwo + "Chars: " +  letterThree + "Chars: " + numberOne  + specialOne);

    }
}
