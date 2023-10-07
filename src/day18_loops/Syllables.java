package day18_loops;

public class Syllables {

    public static void main(String[] args) {
        String str = "ja-va-script";
        int dashCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-'){
                dashCounter++;
            }
        }

        System.out.println("You have " + (1 + dashCounter) + " syllables");
    }
}
