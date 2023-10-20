package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

    int [] nums = {4, 10, 30, 20, 100};

    //Must be sorted for this method to work correctly
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 10));
        System.out.println(Arrays.binarySearch(nums, 20)); //will add position it should be in +1 and then make it negative
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200));


    }
}
