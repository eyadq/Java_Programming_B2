package day09_a_scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        double angle1 = 0;
        double angle2 = 0;
        double angle3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three angles in degrees");
        angle1 = input.nextDouble();
        angle2 = input.nextDouble();
        angle3 = input.nextDouble();

        double angleSum = angle1 + angle2 + angle3;
        boolean isCircle = angleSum == 360;
        boolean isTriangle = angleSum == 180;

        System.out.println("Is the shape with these angles a triangle: " + isTriangle);
        System.out.println("Is the shape with these angles a circle: " + isCircle);


    }
}
