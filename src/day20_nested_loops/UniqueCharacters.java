package day20_nested_loops;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "AABXXDEEF"; //Goal to get BDF
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {
                if(eachLetter == str.charAt(j)){
                    counter++;
                }
            }
            if(counter == 1){ //This condition check if letter is in String only 1 time. If TRUE, add it to unique
                unique += eachLetter;
            }

        }
        System.out.println(unique);
    }
}
