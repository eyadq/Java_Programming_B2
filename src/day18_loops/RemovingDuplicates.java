package day18_loops;

public class RemovingDuplicates {

    public static void main(String[] args) {

        String original = "abcabcd";
        String unique = "";

        for (int i = 0; i < original.length(); i++) {
            char eachLetter = original.charAt(i);
            String each = "" + eachLetter;

            if(!unique.contains(each)){
                unique += eachLetter;
            }

        }
        System.out.println("With duplicates: " + original);
        System.out.println("Without duplicates: "+ unique);

    }
}
