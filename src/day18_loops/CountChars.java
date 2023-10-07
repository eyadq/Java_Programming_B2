package day18_loops;

public class CountChars {

    public static void main(String[] args) {

        String str = "2jDedf87WegT&!";
        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int countSpecial = 0;

        for (int i = 0; i < str.length(); i++) {
           char eachLetter =  str.charAt(i);
           if(eachLetter >= 65 && eachLetter <=90) {
               countUpper++;
           }
            else if(eachLetter >= 97 && eachLetter <=122) {
                countLower++;
            }
            else if(eachLetter >= 48 && eachLetter <=57) {
                countNum++;
            }
            else {
                countSpecial++;
           }
        }
        System.out.println(countUpper + " uppercase\n" + countLower + " lowercase\n"  + countNum +
                " digits\n" + countSpecial + " special characters");
    }
}
