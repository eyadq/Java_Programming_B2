package day18_loops;

import java.beans.PropertyEditorSupport;

public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = ""; //should be "avaj"

        for (int i = original.length() -1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Is \"" + original + "\" a palidrome: " + original.equals(reversed));

        //with ternary
        System.out.println(original.equals(reversed) ? "It is a palindromme" : "It is not a palindrome");
    }
}
