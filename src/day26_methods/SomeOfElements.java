package day26_methods;

import my_utilities.ArrayUtil;

public class SomeOfElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(sumOfArray(arr)); //since from same class, i can just use method name
        System.out.println(ArrayUtil.sumOfArray(arr)); //need to import the package and use the class name to call the method
    }

//    public static int sumOfArray ( int[] arr){
//        int sum = 0;
//
//        for (int element: arr) {
//            sum += element;
//        }
//        return sum;
//    }

    //var ags - essentially takes a group of values of same data types similar to array
    public static int sumOfArray (int ... arr){
        int sum = 0;

        for (int element: arr) {
            sum += element;
        }
        return sum;
    }

}
