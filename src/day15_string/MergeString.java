package day15_string;

public class MergeString {

    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";

        String merged = "";
        merged += a.charAt(0);
        merged += b.charAt(0);


        merged += a.charAt(1);
        merged += b.charAt(1);


        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println(merged);
    }
}
