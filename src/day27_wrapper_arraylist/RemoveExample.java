package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("water");
        list.add("bread");
        list.add("apple");
        list.add("butter");

        System.out.println(list);

        list.add(1, "cherry"); //will put "cherry" at index 1 and moves everything aftyer one index to the right
        System.out.println(list);

        //How can I get the last elemtn in the arrayList
        System.out.println(   list.get(list.size() - 1)       );

        list.remove(0); //will delete index 0, which is currently "water"
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list); //will remove last element, "butter"
        list.remove("bread"); //will remove "bread"
        System.out.println(list);
        list.remove("banana"); //wont do anything since no element matches the paramamter
        System.out.println(list);
        System.out.println(list.remove("apple")); //return true since "apple" element exists, will aslo remove it
        System.out.println(list);

        list.add("light");
        list.add("cashews");
        list.add("light");
        System.out.println(list);
        list.remove("light"); //will remove first instance
        System.out.println(list);

    }
}
