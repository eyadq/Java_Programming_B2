package day15_string;

public class IndexOfMethod {

    public static void main(String[] args) {
        String str = "pen";
        System.out.println(str.indexOf("p")); //0
        System.out.println(str.indexOf("p")); //1
        System.out.println(str.indexOf("p")); //2


        System.out.println(str.indexOf("x")); //-1

        if (str.indexOf("x") == -1){
            System.out.println("If indexOf() produces -1, str does not provide character");
        }

        //normal way
        if(!str.contains("x")){
            System.out.println("x is not in the string");
        }

        System.out.println("---------------");
        String str2 = "people";
        System.out.println(str2.indexOf("p")); // prints index of first occurance
        str2 = "encpil";
        System.out.println(str2.indexOf("p")); // It will look for the "p" and will return the index of the FIRST match

        System.out.println("-----------");
        String str3 = "loopcamp";
        //             01234567
        System.out.println(str3.indexOf("pc")); // 3
        System.out.println(str3.indexOf("camp")); // 4
        System.out.println(str3.indexOf("camping")); // -1
        System.out.println(str3.indexOf("loo")); // 0
        System.out.println(str3.indexOf("look")); // -1

    }
}
