package day31_custom_classes;

public class Coffee {
    double price;
    double size;
    String brand;
    String type;


    @Override
    public String toString() {
        return type + " from " + brand + " and size of " + size + " oz. \nFor a total price $" + price;
    }


    public void drink () {
        System.out.println("Drinking " + type + " of coffee.");
        size -= 2;
    }

    public void refill (int oz) {

        if (size + oz <= 16) {
            System.out.println("Refilling... " + oz + " oz of coffee");
            size += oz;  // size = size + oz
        } else {
            System.out.println("You cannot go over 16 oz");
        }

    }

}
