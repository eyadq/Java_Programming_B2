package day15_string;

public class IndexOfMethod2 {

    public static void main(String[] args) {

        String str = "definition";
                  //  0123456789
        System.out.println("first i index: " + str.indexOf("i")); //3
        System.out.println("first i index: " + str.indexOf('i')); //3
        System.out.println("last i index: " + str.lastIndexOf('i')); //3
        System.out.println("last i index: " + str.lastIndexOf('i')); //3

        //Start from 4th index to find the second i
        System.out.println("Second i index: " + str.indexOf('i', str.indexOf("i") + 1));
    }
}
