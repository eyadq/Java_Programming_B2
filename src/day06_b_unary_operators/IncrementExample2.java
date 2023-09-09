package day06_b_unary_operators;

public class IncrementExample2 {

    public static void main(String[] args) {

        int age = 20;
        System.out.println(age); //20
        System.out.println(age++); // Prints 20 but then x will be 21
        System.out.println(age); // 21

        System.out.println(age++ + 2); // 23 but then updates age to 22
        System.out.println(age); // 22




    }
}
