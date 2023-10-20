package day23_multidimensional_arrays;

public class AWS {

    public static void main(String[] args) {

        String zones = "us-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";

        // "application deploying on $us-east1"
        //I need to firs get each zone - I can use .split to seperate each zone and store into Array
        String [] zonesArr = zones.split(", ");

        for (String each: zonesArr){
            System.out.println(app + " is deploying on " + each);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < zonesArr.length; i++) {
            System.out.println(app + " is deploying on " + zonesArr[i]);
        }

    }
}
