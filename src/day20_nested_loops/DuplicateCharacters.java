package day20_nested_loops;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "AABXXDEEF"; //if the character is in the string 2 or more times
        String str2 = "AABXXDEEF";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++){
            char eachOuterLetter = str.charAt(i);
            int count = 0;

            if(duplicates.contains("" + eachOuterLetter)){
                continue;
            }

            for (int j = 0; j < str2.length(); j++) {
                char eacInnerLetter = str.charAt(j);
                if (eacInnerLetter == eachOuterLetter){
                    count++;
                }
            }
            if (count > 1){
                duplicates += eachOuterLetter;
            }
        }

        System.out.println(duplicates);
    }
}
