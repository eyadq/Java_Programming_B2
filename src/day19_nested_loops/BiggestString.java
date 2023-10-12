package day19_nested_loops;

public class BiggestString {
//Find buggest substring of matching characters
// ex:aaabbbccccdddee Output:cccc
    public static void main(String[] args) {

        String str = "aaabbbccccdddee";
        String sub = "";
        String biggest = "";

        for (int i = 0; i < str.length()-1; i++) {
            sub += str.charAt(i);
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (sub.length() > biggest.length()) {
                    biggest = sub;
                }
                sub = "";
            }

            /*
            This is in case we have the longest at the end.
            We can apply the if condition, but need to check where in execution to put

            if (i == str.length()-2){
              if(biggest.contains("" + str.charAt(str.length()-1))) {
                biggest+=str.charAt(str.length()-1);
              }
            }
         */
        }
        System.out.println(biggest);

    }
}
