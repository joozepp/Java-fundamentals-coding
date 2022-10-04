package Basics;

import java.util.Scanner;

/**
 * To calculate area and perimeter of a circle
 * Area = Pi r^2.
 * Perimeter = 2Pi R
 * @author Joozepp
 *
 */
public class Perimeter {
    public static void main(String[] args) {
        final float pi = 3.14f; //constant value final = ei saa muuta valuet
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        float radius = scanner.nextFloat();

        //Area
        float area = pi *(radius * radius);

        //perimeter (Circumference)
        float perimeter = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);




    }
}
