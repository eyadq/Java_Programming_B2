package day18_loops;

import java.util.Scanner;

public class CharactersAsNumbers {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        String str = "loop";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += (int)str.charAt(i) + " ";
        }
        System.out.println(result);

    }
}
