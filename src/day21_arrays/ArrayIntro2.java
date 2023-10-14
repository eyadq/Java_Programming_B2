package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {

    public static void main(String[] args) {
        double[] arr = new double[4]; //4 elements in this array of type double, will be initiilzed
        System.out.println(arr.length); //4
        System.out.println(Arrays.toString(arr)); //[0.0, 0.0, 0.0, 0.0] Already initilized

        //How can I assign 30.99 to index 0?
        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr)); //[30.99, 0.0, 0.0, 0.0]

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 4;
        System.out.println(Arrays.toString(arr)); //[30.99, 12.55, 10.2, 4.0] NOTE: 4 was cast to 4.0

        //We said we cannot change the size of an array
        //But we can change the value of the specific indexed element
        arr[2] = 200.0; //We re-ASSIGNED the value at index 2
        System.out.println(Arrays.toString(arr)); //[30.99, 12.55, 200.0, 4.0]

        arr = new double[4]; //Creates a new array with 4 elements
        System.out.println(Arrays.toString(arr)); //[0.0, 0.0, 0.0, 0.0]

        String [] strArr = new String[5];
        System.out.println(Arrays.toString(strArr)); //[null, null, null, null, null]

        // null and emptyString are not same thing

        //3rd but very RARE DECLARATION
        char [] arr2 = new char[]{1, 4, 5, 8};
        System.out.println(arr2.length); //4
        System.out.println(Arrays.toString(arr2));





    }
}
