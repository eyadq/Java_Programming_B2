package day17_loops;

public class DoWhileExample {

    public static void main(String[] args) {
        int a = 1;
        do {
            //everything between braces are in the loop
            System.out.println(a);
            a++;
        } while (a <= 10);

        //This loop has a boolean of false but it still runs through the code body ONE TIME. Feature of do while loop
        int a2 = 0;
        do {
            System.out.println(a2);
            a++;
        } while (a2 == 10);

        //While loop, loop body does not execute
        int a3=0;
        while (a3 == 10) {
            System.out.println(a3);
            a3++;
        }

    }
}
