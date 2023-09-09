package day05_variables;

public class School {


    public static void main(String[] args) {

                /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
        int nunberOfStudentsInGrade1 = 30;
        int nunberOfStudentsInGrade2 = 40;
        int nunberOfStudentsInGrade3 = 25;
        int nunberOfStudentsInGrade4 = 10;
        int nunberOfStudentsInGrade5 = 38;

        int numberOfStudents = nunberOfStudentsInGrade1 + nunberOfStudentsInGrade2 + nunberOfStudentsInGrade3 +
                nunberOfStudentsInGrade4 + nunberOfStudentsInGrade5;

        System.out.println(numberOfStudents);

        double numberOfSchoolDaysInAYear = 100.5;
        double numberOfSnowDaysInAYear = 10;
        double averageGPAInSchool = 3.5;

        System.out.println("Numbers of Student in Grade 1: " + nunberOfStudentsInGrade1);
        System.out.println("Numbers of Student in Grade 2: " + nunberOfStudentsInGrade2);
        System.out.println("Numbers of Student in Grade 3: " + nunberOfStudentsInGrade3);
        System.out.println("Numbers of Student in Grade 4: " + nunberOfStudentsInGrade4);
        System.out.println("Numbers of Student in Grade 5: " + nunberOfStudentsInGrade5);

        System.out.println("Number of school days in a year: " + numberOfSchoolDaysInAYear);
        System.out.println("Number of snow days in a year: " + numberOfSnowDaysInAYear);
        System.out.println("Average GPA of entire school " + averageGPAInSchool);



    }
}
