package day27_wrapper_arraylist;

import java.util.Scanner;

public class WrapperClassObject {

    public static void main(String[] args) {
        int a = 5;
        //We can assign a new value (reassign)
        // a,ethod() -- ? We CANNOT do this

        Scanner input = new Scanner(System.in); //input is an object reference
        Integer a1 = new Integer(10);
        //How can i convert the primitive data type into object type
        Integer a2 = 20; //a2 is a Object reference
        //Every whole number in Java in
        // Line 18 - takes the int 20 and AUTOBOXES it into Integer Wrapper class

        // The below example is to explain the same logic behind CASTING which is similar to autoboxing
        //double d = 10;
        //System.out.println(d); 10.0

        int a3 = a2; //UNBOXING -> converting Integer into int

        byte b = 4;
        Byte b1 = b;
        Byte b2 = b1;
    }


}
