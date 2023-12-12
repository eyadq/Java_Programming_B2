package day21_arrays;

import java.util.Arrays;

public class Store {

    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "Clothes", "Airpods", "IPhones"};

        //Do you have jackets in the store?
        //Here is simple String method chaining and check if it contains
        System.out.println("Does store contain jackets?: " + Arrays.toString(items).toLowerCase().contains("jacket"));

        boolean hasJacket = false;
        for (String item: items) {
            if (item.toLowerCase().contains("jacket")){
                hasJacket = true;
                break;
            } else {
                hasJacket = false;
            }
        }

        if(hasJacket){
            System.out.println("We have it in the store");
        } else {
            System.out.println("We do not have it in the store");
        }

        System.out.println(hasJacket ? "We have it in the store" : "We do not have it in the store");

        System.out.println((Arrays.toString(items).toLowerCase().contains("jacket"))
                ? "We have it in the store" : "We do not have it in the store");

        //Ask a user to give you how many items are in sotck
        //Then store those item names intp String array by asking items name to the user
        //Then ask a user which item they are looking for.
        //If it exist, print "Item is in stock:
        //If not, print "Item is not in stock"


    }
}
