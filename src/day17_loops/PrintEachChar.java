package day17_loops;

public class PrintEachChar {

    public static void main(String[] args) {

        String str = "loop";
        //            0123

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); //easy to go index out of bounds with loops
        }
    }
}
