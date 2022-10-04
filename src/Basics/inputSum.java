package Basics;

import java.util.Scanner;

/**
 * To read two numbers from userinput, and print the result
 * @author Joozepp
 */

public class inputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the first number");
        int numberOne = scanner.nextInt();

        System.out.println("Please give me the second number");
        int numberTwo = scanner.nextInt();

        int sum = numberTwo + numberOne;

        System.out.println("the answer is: " + sum);

    }
}
