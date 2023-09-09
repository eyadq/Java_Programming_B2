package day05_variables;

public class MyName {

    public static void main(String[] args) {
        char first = 'E';
        char second = 'y';
        char third = 'a';
        char forth = 'd';

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);

        System.out.println(first + second + third + forth);
        System.out.println("" + first + second + third + forth);
        String myName = "" + first + second + third + forth;
        System.out.println(myName);

    }
}
