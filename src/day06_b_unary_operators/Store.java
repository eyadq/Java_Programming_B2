package day06_b_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTV = 100;

        System.out.println("Person comes into the store and they bought a TV");
        //numberOfTV = numberOfTV -1
        System.out.println("Number of TV now: " + --numberOfTV);

        System.out.println("First person returend TV");
        System.out.println("Number of TV now: " + ++numberOfTV);

    }
}
