package day16_loops;

public class Replace {

    public static void main(String[] args) {
        String str = "java is a language";
        //            0123456789...
        String first = str.substring(0, str.indexOf(" ")); //java
        String second = str.substring(str.indexOf(" ") + 1 ); //is a language
        String result = second + " " + first;
        System.out.println(result);
    }
}
