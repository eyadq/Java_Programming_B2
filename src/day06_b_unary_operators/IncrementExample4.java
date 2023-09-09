package day06_b_unary_operators;

public class IncrementExample4 {

    public static void main(String[] args) {
        int i = 5;
        int z = i++; // z=5, i=6

        int a = 10;
        int b = a +10;

        int c = a++; // a= a+1, a = 11
        System.out.println(c); // 11
        System.out.println(a); // 11
    }

}
