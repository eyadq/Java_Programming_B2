package day24_methods;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        //Palindrome - if the words same from beginning or end
        //Anagram - if 2 woirds has same letters

        String str1 = "loop";
        String str2 = "pool";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //false

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr1 equals arr2 after sort: " + Arrays.equals(arr1, arr2));
    }
}
