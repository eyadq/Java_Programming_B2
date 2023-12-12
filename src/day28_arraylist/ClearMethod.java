package day28_arraylist;

import java.util.ArrayList;
/*
    .add(parameter)
    .add(index, parameter)
    .get(index)
    .remove(index) - > if finds returns Element / And removes the given index if exist
    .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
    .size()
    .contains (parameter) - > if the given parameter exists in the Arraylist, it returns true. If not, it returns false
 */
public class ClearMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println(nums);
        System.out.println(nums.size()); //5

        System.out.println(nums.isEmpty());

        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size()); //0
        System.out.println(nums.isEmpty()); //true

    }
}