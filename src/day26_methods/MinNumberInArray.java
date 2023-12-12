package day26_methods;

import java.util.Arrays;

public class MinNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 45, 26, 78, 99};
    }

    public static int minInArray1(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }

    public static int minInArray(int[] arr){
        int min  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
