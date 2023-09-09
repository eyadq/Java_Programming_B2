package day05_variables;

public class CellPhone {

    public static void main (String [] args) {

        String brand = "Google";
        String model = "Pixel 6";
        String color = "coral";
        double price = 649.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have a " + color + " " + brand + " " + model + ". For $" + price + " it has " +
                storage + "GB. The statement \"it has a camera\" is " + hasCamera + ". It has sim type " + sim + ".");

    }
}
