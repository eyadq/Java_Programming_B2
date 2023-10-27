package my_utilities;

public class StringUtil {

    /**
     * Takes a words as a string and returns the word reversed
     * @param word
     * @return
     */
    public static String reverse(String word){
        String reversed = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    /**
     * Counts the number of occurances of the given char in the word, represented by the given String
     * @param word
     * @param letter
     * @return
     */
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

    /**
     * This method fixes the format of given String
     * Making the first letter uppercase and the rest in lowercase
     * @param name
     * @return
     */
    public static String fixFormat (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    /**
     * Returns if a word is a palindrome (a word that is equal if read in reverse
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word){
        String reversed = ""; //should be "avaj"

        for (int i = word.length() -1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed.equals(word);

    }
}
