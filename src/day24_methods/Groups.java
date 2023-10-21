package day24_methods;

import java.util.Arrays;

public class Groups {

    public static void main(String[] args) {

        String [][] groups = new String[4][];
        System.out.println(Arrays.deepToString(groups)); //[null, null, null, null] same as single array

        //String[][] groups = new String[4][3];
        //System.out.println(Arrays.deepToString(groups)); //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]]

        String [] group1 = {"Gular", "Maya", "Parvana"};
        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups)); //[[Gular, Maya, Parvana], null, null, null]

        String [] group2 = {"Iryna", "Aytaj", "Elturk", "Anna"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups)); //[[Gular, Maya, Parvana], [Iryna, Aytaj, Elturk, Anna], null, null]

        String [] group3 = {"Ramiz", "Natalia"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups)); //[[Gular, Maya, Parvana], [Iryna, Aytaj, Elturk, Anna], [Ramiz, Natalia], null]

        String [] group4 = {"Aslan"};
        groups[3] = group4;
        System.out.println(Arrays.deepToString(groups)); //[[Gular, Maya, Parvana], [Iryna, Aytaj, Elturk, Anna], [Ramiz, Natalia], [Aslan]]

        System.out.println("-------------------------------");

        System.out.println("For each loop will print out each inner element of array: ");
        for (String [] eachElem: groups){
            System.out.println(Arrays.toString(eachElem));
        }

        System.out.println("-------------------------------");

        System.out.println("Fori loop will print out each inner element of array: ");
        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));
        }

        System.out.println("-------------------------------");

        System.out.println("For each loop will print out names: ");
        for ( String [] each : groups){
            for (String eachName: each) {
                System.out.println(eachName);
            }
        }




    }
}
