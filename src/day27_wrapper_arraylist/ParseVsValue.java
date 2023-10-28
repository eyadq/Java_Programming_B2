package day27_wrapper_arraylist;

public class ParseVsValue {

    public static void main(String[] args) {

        String str = "30";

        int num1 = Integer.parseInt(str); //converts String -> int primitive data type
        int num2 = Integer.valueOf(str); //converts String -> Integer wrapper data type

        int num3 = Integer.valueOf(str); //String -> Integer -> unboxed into primitive NOT RECOMMENDED
        Integer num4 = Integer.parseInt(str); //String -> int primitive -> autoboxing into Integer

        String boolValue = "true";
        Boolean isValue = Boolean.valueOf(boolValue);
        System.out.println(isValue);

        //Does not cause exception but get false instead of expected result: true
        String boolValue2 = "234true12";
        Boolean isValue2 = Boolean.valueOf(boolValue2);
        System.out.println(isValue2);

    }
}
