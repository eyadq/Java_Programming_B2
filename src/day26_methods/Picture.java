package day26_methods;

public class Picture {

    //Method overloading
    //Same method name with different paramters
    //So different amounts or different data types
    public static void draw(){
        System.out.println("Trying to draw...");
    }

    //Return type does not matter
//    public static boolean draw(){
//        System.out.println("Trying to draw...");
//        return false;
//    }

    public static void draw(String color){
        System.out.println("Trying to draw with " + color);
    }

    public static void draw(int size){
        System.out.println("Trying to draw with size of " + size);
    }
    //You CANNOT use same method name with same paramters in the same class
//    public static void draw(int amounrt){
//        System.out.println("Trying to draw with size of " + size);
//    }

    public static void draw(String color, String color2){
        System.out.println("Trying to draw with colors " + color + " and " + color2);
    }

    public static void draw(String color, int size){
        System.out.println("Trying to draw with color " + color + " in size of " + size);
    }

    public static void draw(int size, String color) {
        System.out.println("Trying to draw with color " + color + " in size of " + size);
    }

    //Type promotion: If the method exists with the matching data type, it will call that one
    //If that does exist, it will check the higher one.
    //byte > short > float > double
    public static void test (double d) {
        System.out.println("Testing method with double " + d);
    }

    public static void test (int d) {
        System.out.println("Testing method with double " + d);
    }


}
