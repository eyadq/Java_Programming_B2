package day21_arrays;

public class ForEachExample {

    public static void main(String[] args) {
        int [] nums = {30, 12, 150, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional fori loop: " + nums[i]);
        }
        System.out.println();

        //No access to the indivual indexes like a fori with i will have
        //Use fori if you need to reassign a value
        for (int each: nums){
            System.out.println("ForEach loop: " + each);
            if(each == 12){ //I can stop based on the value
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 2){
                nums[i] = 34;
            }
        }

        System.out.println("------------------------");
        String [] classes = {"java", "soft skills", "api", "db", "selenium"};

        //if i want to use foreach loop
        for(String eachElem : classes){
            System.out.println("For Each Loop: " + eachElem);
        }

        for (int i = 0; i < classes.length; i++) {
            System.out.println("For Each Loop: " + classes[i]);
        }

        System.out.println("------------------------");
        double [] prices = {2/3, 45.7, 34, 21.2};
        for(double price : prices){
            System.out.println("Prices " + price);
        }

    }
}
