package my_utilities;

public class ArrayUtil {

    public static int sumOfArray ( int[] arr){
        int sum = 0;

        for (int element: arr) {
            sum += element;
        }
        return sum;
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

    public static int maxInArray(int[] arr){
        int max  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean numberInArray(int[] arr, int numberToCheck){
        boolean containsInArray = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToCheck){
                return true;
            }
        }
        return false;
    }
}
