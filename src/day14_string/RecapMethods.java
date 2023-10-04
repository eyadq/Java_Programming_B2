package day14_string;

public class RecapMethods {

    public static void main(String[] args) {
        String s = "pen";
        String s2 = new String("pen");

        System.out.println("Compare with == " + (s == s2)); //false, different memeory locations
        System.out.println("Compare with .equals() " + (s.equals(s2))); //true, same values

        System.out.println("Compare with .equals() " + (s.equals("Pen"))); //false
        s = "Pen";
        System.out.println("Compare with .equals() " + (s.equals("Pen"))); //true
        String ss = "Pen";

        System.out.println("Compare with .equals() " + (s.equals(ss))); //true, same values

        s = "Pen";
        ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss);

        if(isSame){
            System.out.println("Hello");
        }

        ss = "PENN";
        if(s.equalsIgnoreCase(ss)){
            System.out.println("Hello");
        } else{
            System.out.println("Bye");
        }

        //s -> PEN
        //ss -> PENN

        System.out.println(s.length()); //3 length() does not accept argument so empty ()
        System.out.println(ss.length()); //4

        int a = s.length(); //3
        int b = ss.length(); //4

        if(s.length() < 4) {
            System.out.println("Short word");
        } else {
            System.out.println("Not short");
        }

        System.out.println("aaaaaa".length()); //6
        System.out.println("a    a".length()); //6
        System.out.println("".length()); //0


    }
}
