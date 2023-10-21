package day24_methods;

public class MyFirstMethod {

    public static void helloWord() {

        System.out.println("Hello World");
    }

    //Cannot have method with same name AND same () IN SAME CLASS
//    public static void helloWord() {
//
//        System.out.println("Hello World");
//    }

    public static void helloWorld50 () {
        for (int i = 0; i < 50; i++) {
            //System.out.println("Hello World");
            helloWord();
        }
    }

    public static void main(String[] args) {

        helloWord();
        helloWord();
        System.out.println("------------------------");
        helloWorld50();

    }
}
