package day07_relational_operators;

public class Pizza {

    public static void main(String[] args) {

            /*
        create a class Pizza
        add a main method
        declare and assign these variables:

           type of pizza,  the number of slices,  the number of people eating

        calculate how many slices each person will get
        calculate how many slices are left over

        Sample print statement:

           We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
     */

        String typeOfPizza = "Cheese";
        int numberOfSizes = 17;
        int numberOfPeople = 4;

        int slicesPerPerson = numberOfSizes / numberOfPeople;
        int slicesLeftover = numberOfSizes % numberOfPeople;

        String output = "Each person will get " + slicesPerPerson + " slices and " + slicesLeftover  +
                " slices are left over.";

        System.out.println(output);


    }
}
