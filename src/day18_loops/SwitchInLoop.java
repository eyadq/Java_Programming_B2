package day18_loops;

public class SwitchInLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                        System.out.println("four");
                        break;
                case 5:
                    System.out.println("five");
                    break;
                case 8: //since loop continues until i=5. i never reaches 6. will never reach this case
                    System.out.println("six");
            }
            System.out.println();
        }
    }
}
