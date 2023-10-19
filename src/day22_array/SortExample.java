package day22_array;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        int [] nums = {3, 5, 7, 3243, 8, 23, 23};

        System.out.println(Arrays.toString(nums));

        //.sort() method
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Find min
        System.out.println(nums[0]);
        //Find max
        System.out.println(nums[nums.length - 1]);
    }
}
