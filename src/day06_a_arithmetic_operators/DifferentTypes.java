package day06_a_arithmetic_operators;

public class DifferentTypes {

    public static void main(String[] args){

        //both are int because int and int leads to another int
        System.out.println(10 - 5);
        System.out.println(10 * 5);

        //ons side is double, other is int -> result is double
        System.out.println(10.0 / 5);

        System.out.println(10.0 / 5.0); //Result will be of course double

        System.out.println((10.0 /5)); //Leads to a result of a double as double > int
        System.out.println(((int)10.0 /5)); //Leads to a result of a int double to explicit casting
        System.out.println(((double)10 /5)); //Leads to double

        byte b1 = 10;
        byte b2 = 20;

        //byte sum = b1 + b2; //byte and short do not work like this as the addition casts to int for operations
        byte sum = (byte)(b1+b2);
        System.out.println(sum);


    }
}
