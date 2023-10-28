package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        //ArrayList <int> numbers = new ArrayList<>(); //Collections Claases not work with primitive data types
        ArrayList <Integer> numbers = new ArrayList<>(); //In memory, it allocated size of 10
        System.out.println(numbers.size()); //Even though memory has 10 locations, size() only shows filled locations
        //Comparing to ARRAY we can directly print ARRAYLIST
        System.out.println(numbers);

        numbers.add(100); //.add(x) -> adds x to the end
        System.out.println(numbers);

        numbers.add(-200); //.add(x) -> adds x to the end
        System.out.println(numbers);

        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        //Right now ArrayList [100, -200, 10, 20]
        System.out.println(  numbers.get(0)  ); //100
        System.out.println(  numbers.get(1)  ); //-200
        System.out.println(  numbers.get(2)  ); //10
        System.out.println(  numbers.get(3)  ); //20
        //System.out.println(  numbers.get(4)  ); //Will cause index out of bonds exception

    }
}
