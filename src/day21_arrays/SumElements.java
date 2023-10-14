package day21_arrays;

public class SumElements {

    public static void main(String[] args) {
        int [] nums = {3, 5, 7, 8};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println("sum = " + sum);
    }
}
