package day04_variables;

public class PrimitiveDataTypes {

    public static void main (String [] args){

        byte age = 40; //Declare a variable called byte which is assigned value of 40
        age = 50; //Can reassign value. No need to actually retype println statements
        System.out.println(50); //Has nothing to do with the variable
        System.out.println(age); //The 50 printed out is from the variable

        System.out.println("Java");
        System.out.println("The teacher is not good");
        System.out.println(age); //age has not been manipulated, still prints 50

        //byte age = 95; //Illegal due to age already being a declared variable
        //byte age2 = 950; //Illegal due to 950 being higher than what the byte type allows
        age = 90; //Reassigns value of age

        short year; //Declared the variable, did not assign a value
        year = 2022; //Assigned value to the variable
        year = 2023; //Reassigned value

        int addressNumber = 234235453;

        long bigNumber = 9245347678876L;

        // long year = 2023; //Does not work since we declared year as a short




    }
}
