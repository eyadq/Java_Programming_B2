package day04_variables;

public class Fruits {

    public static void main(String[] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        //int apples = 50, grapes = 100, bananas = 150; //Works if all these variables are of same type

        System.out.println("This is how many apples we have: " + apples);
        // + means concatenation (KON - KATI - NEY - SHIN)

        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        apples = 30;
        System.out.println("Apples after I sold: " + apples);

        int price = 150;
        System.out.println("The price of my 30 apples is 150"); //Hardcoded
        System.out.println("The price of my " + apples + " apple is " + price); //Dynamic
    }



}

