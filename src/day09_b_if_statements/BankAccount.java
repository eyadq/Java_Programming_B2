package day09_b_if_statements;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your bank account balance: $");
        double balance = input.nextDouble();

        System.out.print("How much would you like to withdraw: $");
        double withdraw = input.nextDouble();

        balance -= withdraw;

        if(balance < 0){
            System.out.println("You took out too much.\nYou owe us: $" + (balance));
        } else {
            System.out.println("Your current balance is now: $" + balance);
        }
    }
}
