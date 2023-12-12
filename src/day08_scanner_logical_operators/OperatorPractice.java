package day08_scanner_logical_operators;

public class OperatorPractice {

    public static void main(String[] args) {

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        System.out.println(w);

        int a = 8; //a = 7
        int b = a--; b = 8;
        System.out.println(a); //7
        System.out.println(b); //8


        int l = 50;
        int p = --l + l++ + l-- + l++;
        //  p = 49 + l++ + l-- + l++;
        //  p = 49 + 49 + 50 + 49; //with a = 50
        System.out.println(l);
        System.out.println(p);

        int r = 20;
        int k = -r--+ r++ + --r * r-- % 2;
        //  k = -20+ 19 + 19 * 19 % 2; r=18
        //  k = -20+ 19 + 361     % 2;
        //  k = -20+ 19 + 1;
        //  k = -20+ 19 + 1;
        //  k = 0;

        System.out.println(r);
        System.out.println(k);


    }
}
