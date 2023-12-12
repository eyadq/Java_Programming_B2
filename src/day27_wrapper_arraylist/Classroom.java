package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        System.out.println(group.size());

        group.add("Ulvi");
        group.add("Iryna");
        group.add("Majd");
        group.add("Oleksandr");
        group.add("Ievgeniia");
        group.add("Aslan");

        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First name: " + group.get(0));
        System.out.println("Second name: " + group.get(1));
        System.out.println("Third name: " + group.get(2));
        System.out.println("Forth name: " + group.get(3));
        System.out.println("Fifth name: " + group.get(4));
        System.out.println("Sixth name: " + group.get(5));
        //System.out.println("Seventh name: " + group.get(6)); ////Casuses exception

        System.out.println();

        for (int i = 0; i < group.size(); i++) {
            System.out.println("name " + (i + 1) + ": " + group.get(i));
        }
        System.out.println();

        for (String eachElem: group){
            System.out.println("Name: " + eachElem);
        }

        System.out.println();

        for (String each : group){
            for (int i = 0; i < each.length(); i++) {
                System.out.println("Each Character: " + each.charAt(i));
            }
            System.out.println();
        }

    }
}
