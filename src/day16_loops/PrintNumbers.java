package day16_loops;

public class PrintNumbers {

    public static void main(String[] args) {

        //print even numbers from 1 to 100
        int num = 2;
        while (num <= 100){
            System.out.println(num);
            num +=2;
        }

        //2nd approach
        int i = 1;
        while (i <= 100){
            if(i%2 == 0){
                System.out.println("Even: " + i );
            }
            i++;
        }

        //odd numbers
        i = 1;
        while (i <= 100){
            if(i%2 == 1){
                System.out.println("Odd: " + i );
            }
            i++;
        }
    }
}
