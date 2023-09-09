package day06_a_arithmetic_operators;

public class TypeCasting {

    public static void main(String[] args) {
        byte b = 40;
        int i = b; //converts the byte 40 to a int and stores in variable

        System.out.println(b); //Prints 40 has a byte
        System.out.println(i); //Prints 40 has a int

        int i2 = 100;
        byte b2 = (byte)i2; //int is larger than byte so we must "cast" int to byte type

        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long li = i3; //Since long is larger than int, no issue

        long l2 = 200;
        int i4 = (int) l2;

        System.out.println(l2);
        System.out.println(i4);

        double d = 50;
        // System.out.println(d); // 50.0
        int i5 = (int)d;

        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b3 = (byte)d2; //Must explicitly type cast with typecast operator as double > byte

        //With numbers outside of data ranage -> data loss
        int i6 = 200;
        byte b4 = (byte) i6;

        System.out.println(i6);
        System.out.println(b4);

        double d3 = 45.56;
        int i7 = (int)d3;
        System.out.println(d3);
        System.out.println(i7);





    }
}
