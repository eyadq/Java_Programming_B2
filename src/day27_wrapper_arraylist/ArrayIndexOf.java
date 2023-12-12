package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class ArrayIndexOf {

    public static void main(String[] args) {

        int[] arr = {12, 34, 4, 2, 23, 324, 345, 4, 64};
        //            0   1  2   3  4   5    6    7  8

        System.out.println(indexOf(arr, 4));
        System.out.println(indexOf(arr, 345));

        String[] words = {"hello", "apple", "java", "computer"};
        System.out.println(indexOf(words, "java"));

        //calling indexOf from ArrayUtil instead of one in package
        System.out.println(ArrayUtil.indexOf(arr, 4));
    }

    //method that accepts an int arr and number that returns index of that number in array
    public static int indexOf(int[] nums, int numberToCheck){
        //Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == numberToCheck){
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] str, String word){
        //Arrays.sort(nums);
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(word)){
                return i;
            }
        }
        return -1;
    }
}
