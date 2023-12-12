package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        //Normal String variable declaration
        String cityOne = "Fairfax";
        String cityTwo = "Baku";
        String cityThree = "Houston";
        String cityFour = "Seattle";

        //With data Structure ---> Array
        String[] cities = {"FairFax", "Baku", "Houston", "Seattle"}; //Must be String vaslues seperated with commas
        String[] cities2 = {cityOne, cityTwo, cityThree, cityFour}; //Array with COPIES of original String values
        //Indexes           0         1         2          3

        //How to reach each value from array?
        System.out.println(cities2[0]); //Fairfax
        System.out.println(cities2[1]); //Baku
        System.out.println(cities2[2]); //Houston
        System.out.println(cities2[3]); //Seattle

        System.out.println("All cities: " + cities2[0] + ", " + cities2[1] + ", " + cities2[2] + ", " + cities2[3]);

        //System.out.println(cities[4]); // ArrayIndexOutOfBoundsException due to no index 4

        //How to print an Array
        System.out.println(cities2); //Something similar to "[Ljava.lang.String;@4909b8da", hashcode
        System.out.println(cities2.toString()); //same as above
        System.out.println(Arrays.toString(cities2)); //[Fairfax, Baku, Houston, Seattle]

        //How to get the count of the elements in the array
        //Simialar to String, we have a method --> String str = "loop"; --> str.length()
        System.out.println(cities2.length); //4 NOTE: No [] after length

        System.out.println(cities2[1].substring(0, 2));  // Ba


        System.out.println("" + Arrays.toString(cities2).charAt(0));  // [

        System.out.println(cities2[0] + " " + cities2[2]);



    }
}
