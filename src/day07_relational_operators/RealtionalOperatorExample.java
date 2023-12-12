package day07_relational_operators;

public class RealtionalOperatorExample {

    public static void main(String[] args) {

        System.out.println(10 > 5); //true
        System.out.println(10 > 5); //false
        int a = 5;
        int b = 3;

        System.out.println(a > b); //true
        System.out.println(a < b); //false

        boolean result1 = a > b;
        boolean result2 = a < b;
        System.out.println(result1);
        System.out.println(result2);

        System.out.println(6 >= 6); //true
        System.out.println(10 == 10); //true
        System.out.println(12 != 12); //false

        //System.out.println(f == g); Cannot do as f and g have not been declared as variables
        System.out.println('f' == 'g'); //Comparing ascii values of 'g' and 'f' characters

    }
}
