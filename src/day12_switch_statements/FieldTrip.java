package day12_switch_statements;

public class FieldTrip {

    /*
Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip.
Print the information at the end.

declare and assign the grade level variable

    only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
        so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
 */

    public static void main(String[] args) {

        int gradeLevel = 1;
        String location = "";
        int numOfGroups = 0;
        String teacher = "";

        if(gradeLevel >= 1 && gradeLevel <= 6){
            if(gradeLevel == 1){
                location = "Apple orchard";
                numOfGroups = 2;
                teacher = "Mrs. Smith";
            } else if(gradeLevel == 2){
                location = "Zoo";
                numOfGroups = 3;
                teacher = "Mrs. Tom";
            } else if(gradeLevel == 3){
                location = "Acquarium";
                numOfGroups = 4;
                teacher = "Mrs. Jerry";
            } else if(gradeLevel == 4){
                location = "Movie";
                numOfGroups = 3;
                teacher = "Mrs. VinniePu";
            } else if(gradeLevel == 5){
                location = "Musuem";
                numOfGroups = 3;
                teacher = "Mrs. Carl";
            } else {
                location = "Loopcamp";
                numOfGroups = 3;
                teacher = "Mrs. Academy";
            }

            System.out.println("Field trip information for grade " + gradeLevel);
            System.out.println("\tLocation: " + location);
            System.out.println("\tNumber of groups: " + numOfGroups);
            System.out.println("\tTeacher in charge: " + teacher);

        } else {
            System.out.println("Grade must be between 1-6");
        }

    }
}
