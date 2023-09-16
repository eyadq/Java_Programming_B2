package day08_scanner_logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int n = 20;

        System.out.println(n > 5); //true
        System.out.println(n > 10); //false

        System.out.println(n > 5 && n < 10); // 5 < n < 10 is false

        System.out.println(n > 5 || n < 10); // true OR false is false

        System.out.println(4 > 3 || false);  //true
        System.out.println(3 < 4 || false);  //true
        System.out.println(4 < 3 || false);  //false

        System.out.println(!false); //result will be flipped
        System.out.println(!true);  //result will be flipped

        System.out.println(4 != 4); //false




    }
}
