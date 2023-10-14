package day21_arrays;

public class Average {

    public static void main(String[] args) {

        int [] arr = {2, 4, 6, 12, 45, 67, 87, 34, 87, 34};
        int sum = 0;

        for (int each : arr){
            sum += each;
        }
        System.out.println("average = " + sum/arr.length);

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average: " + (sum/ arr.length));
    }
}
