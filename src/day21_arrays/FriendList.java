package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many friends do you have?: ");
        int numOfFriends = input.nextInt();

        String [] friendNameList = new String[numOfFriends];
        for (int i = 0; i < numOfFriends; i++) {
            System.out.println("Enter your friend's name: ");
             friendNameList[i] = input.next();
        }
        System.out.println("Your friend List:\n" + Arrays.toString(friendNameList));




    }
}
