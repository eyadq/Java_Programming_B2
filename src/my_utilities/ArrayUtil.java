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

    public static String [] addElementInArr (String [] originalArr, String str) {  // ["java", "loop"]

        String [] newArr = new String [originalArr.length + 1]; // [ _, _, _, ........ ]

        for (int i = 0; i < originalArr.length; i++) {

            newArr[i] = originalArr [i];
        }
        // [ "java", "loop", null]
        newArr [newArr.length - 1] = str;


        return newArr;
    }

    //TODO: Create a method that accepts two arrays (int[], int[]) and return combined version
}
