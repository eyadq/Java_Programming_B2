package day13_string;

public class StringMethods {

    public static void main(String[] args){
        String str = "loopcamp";
        str = str + " is nice."; //String class is immutable. The old string is still in memory. str will point to new value.
                                //Editing a string CREATES entire new string object in memory
        String name = "Valentina";
        System.out.println(name == "valentina"); //Never use relational operator to compare strings

        System.out.println(name.equals("Valentina")); //Now comparing values instead of memory location
        System.out.println(name.equals("Parvana"));
        boolean result = name.equals("Loopcamp");
        System.out.println(result);

        System.out.println(name.equalsIgnoreCase("VaLenTINA"));
        System.out.println("-------------------------");

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a==b); //These strings are in a different memory location, cannot match using ==
        a.equals(b); //Is actually comparing the values of the strings to each other; not memory location

        System.out.println(a.length()); //returns numbers of characters

    }
}
