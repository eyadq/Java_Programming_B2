package day15_string;

import java.util.Scanner;

public class LongestWithA {

    /*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();
        String message = "";

//        String largest;
//        String medium;
//        String smallest;
//
//        if(wordOne.length() > wordTwo.length() && wordOne.length() > wordThree.length()){
//            largest = wordOne;
//            if(wordTwo.length() > wordThree.length()){
//                medium = wordTwo;
//                smallest = wordThree;
//            } else {
//                medium = wordThree;
//                smallest = wordTwo;
//            }
//        } else if(wordTwo.length() > wordOne.length() && wordTw0.length() > wordThree.length()){
//            largest = wordTwo;
//            if(wordOne.length() > wordThree.length()){
//                medium = wordOne;
//                smallest = wordThree;
//            } else {
//                medium = wordThree;
//                smallest = wordOne;
//            } if(wordThree.length() > wordOne.length() && wordThree.length() > wordTwo.length()) {
//                largest = wordThree;
//                if (wordOne.length() > wordTwo.length()) {
//                    medium = wordOne;
//                    smallest = wordTwo;
//                } else {
//                    medium = wordTwo;
//                    smallest = wordOne;
//                }
//            }


        int wordOneLength = wordOne.length();
        int wordTwoLength = wordTwo.length();
        int wordThreeLength = wordThree.length();
        //This way we are finding the words with "a" if no a the size is 0
        if (!wordOne.contains("a")) {
            wordOne = "";
            wordOneLength =  wordOne.length();  // 4
        }
        if (!wordTwo.contains("a")) {
            wordTwo = ""; // mouse  --- 5 --- wordTwo --- > 0;
            wordTwoLength =  wordTwo.length();   // 0
        }
        if (!wordThree.contains("a")){
            wordThree ="";
            wordThreeLength =  wordThree.length(); // 0
        }


        if (wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength) {
            message = "The longest with a: " + wordOne;
        } else if (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
            message = "The longest with a: " + wordTwo;
        } else if (wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength) {
            message = "The longest with a: " + wordThree;
        }
        System.out.println(message);






    }
}
