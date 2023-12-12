package day16_loops;

public class Fractorial {

    public static void main(String[] args) {
        //find factorial 5! --> 5 * 4 * 3 * 2 * 1

        int num = 5;
        int result = 1;

        while (num >= 1){
            System.out.print("Result so far: " + result + " * " + num);
            result *= num--;
            System.out.println(" = " + result);
        }
        System.out.println(result);
    }
}
