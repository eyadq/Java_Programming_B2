package day06_b_unary_operators;

public class IncrementExample {

    public static void main(String[] args) {
        int x = 0;
        System.out.println(x); // 0

        x = x = 1;
        System.out.println(1); // 1

        // Shorter way to write x = x + 1: Post-increment and Pre-Increment
        //Post Increment
        x++; // x = x = 1;
        System.out.println(x);
         //Pre-Increment
        ++x;
        System.out.println(x);

        //Post vs Pre Increment
        System.out.println(++x); //Pre - update x and then print
        System.out.println(x++); //Post - prints first then updates x
        System.out.println(x);



    }
}
