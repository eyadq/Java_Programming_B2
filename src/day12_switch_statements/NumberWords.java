package day12_switch_statements;

public class NumberWords {

    public static void main(String[] args) {

        int n = 7; //Must be between 1 and 5, inclusive

        //else-if
        if(n == 1){
            System.out.println("One");
        } else if(n == 2){
            System.out.println("Two");
        } else if(n == 3){
            System.out.println("Three");
        } else if(n == 4){
            System.out.println("Four");
        } else if(n == 5){
            System.out.println("Five");
        }
        else {
            System.out.println("Invalid number");
        }

        //switch
        switch (n) { // byte, short, int, char, String | It will not work with boolean expression
            case 1: //Exact vslues cannot be duplicated, gives compiler error
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 4: //The order of cases does not matter
                System.out.println("Four");
                break;
            default: //default can also be in a different place
                System.out.println("Invalid number");
                break;
        }
    }
}
