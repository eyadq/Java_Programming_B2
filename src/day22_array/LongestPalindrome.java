package day22_array;

public class LongestPalindrome {
    /*
            [IQ] Longest Palindrome
                Given a String array. Find the longest Palindrome String in your array.
                Ex:
                Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
                Output: racecar
                Ex:
                Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                Output: No palindrome

 */
    public static void main(String[] args) {
        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String biggestPalindrome = "";

        for (int i = 0; i < arr.length; i++) { //Outer loop is for getting each element of the array, which is a string
            String eachWord = arr[i]; //On each cycle I am assogning that Strign to a String variable
            String reverse = ""; //Each iteration, this String will be redeclared as empty String
            for (int j = eachWord.length()-1; j >= 0; j--) { //Inner loop is for iterating over the string and making a reverse String
                reverse += eachWord.charAt(j);
            }
            if(eachWord.equals(reverse) && eachWord.length() > biggestPalindrome.length()){
                biggestPalindrome = eachWord;
            }
        }

        System.out.println("biggestPalindrome = " + biggestPalindrome);
    }
}
