package day13_string;

public class StringMemory {

    public static void main(String[] args) {
        int num = 4;
        byte num2 = 5;
        char letter = 'f';
        double num3 = 34.5;
        String str = "hHello"; //Classes, objects, non-Primitives are capitilized
        String str2 = new String("Hello"); // Use new keyword with objects and classes

        String zero = "Java'";
        String first = "java"; //String literal -> Heap Pool
        String second = new String("java"); //Stored directly in the heap, not in the pool

        String third =  "java";
        String forth = new String("java");
        System.out.println(zero==first); //one is capital, one is not.
        System.out.println(first==second);//one is in pool, other is directly in heap, cannot match
        System.out.println(first==third);//both in the pool, a litteral can only be stored once, so they match
        System.out.println(second==forth);//each one is completely seperate value stored in heap

        //Thus == (relational operator) in String is comparing memory location







    }
}
