package day22_array;

import java.util.Arrays;

public class CharArrau {

    public static void main(String[] args) {
        char [] arr = {'j', 'a', 'v', 'a'};

        for (char eachChar: arr){
            System.out.println(eachChar);
        }

        String word = "java";
        char [] wordArray = new char[word.length()];

        //For loop to make a char[] equal to the String
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
        }

        //This String method is equilivant to our for loop:
        char [] charArr = word.toCharArray();
        System.out.println(Arrays.toString(charArr));

        for (char everyElement: charArr){
            System.out.println(everyElement);
        }

        System.out.println(charArr[0] + " should be j");

        //How can we convert from char array to String
        char [] day = {'w', 'e', 'd', 'n', 'e', 's', 'd', 'a', 'y'};

        String dayString = "";
        for (char element: day){
            dayString += element;
        }

        System.out.println(dayString);

        //the .toString() method comes from Object class. We will talk about later
        String str2 = day.toString();
        System.out.println(str2); //Not what we expect

        //Simple way to convert char[] to String
        String str3 = new String(day);
        System.out.println(str3);

        //Now we have access to String methods
        System.out.println(str3.toUpperCase());
        System.out.println(str3.substring(0, 3).toUpperCase()); //WED
        System.out.println(("" + str3.charAt(0)).toUpperCase() + str3.substring(1));
    }
}
