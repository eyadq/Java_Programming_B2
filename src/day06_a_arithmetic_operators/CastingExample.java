package day06_a_arithmetic_operators;

public class CastingExample {

    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // Short < float. implicit casting

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3; // float > short. explicit casting

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300.0f;
        byte num6 = (byte)num5;

        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        System.out.println((int)letter);

        int let2 = 66;
        char let3 = (char)let2;
        System.out.println(let3);
        System.out.println((char)66);

        System.out.println((int)'6');



    }
}
