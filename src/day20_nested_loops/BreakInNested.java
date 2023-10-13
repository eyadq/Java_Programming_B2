package day20_nested_loops;

public class BreakInNested {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i " + i);
            //break; //Will cause java:unreachable statement error as the code below will cannot be be executed

           //if (i ==  3){
           //     break; //Will work as it is possible to reach the below code, like if i is 1 or 2
            // }

            for (int j = 0; j < 2; j++) {
                System.out.println("j " + j);
                //break; //This terminates this loop, not the outer loop
            }
            break;
        }

    }
}
