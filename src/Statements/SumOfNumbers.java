package Statements;

import java.util.Scanner;

/**
 * To find sum of n numbers
 * @author Joozepp
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many numbers you want to sum?");
        int n = scanner.nextInt();
        int sum = 0;

        System.out.println("enter numbers to sum:");

        for (int i = 1; i <= n; i++) {
            System.out.println("number" + i + ": ");
            int input = scanner.nextInt();
            sum += input; //sum = sum + input
        }

        System.out.println("Sum: " + sum);


    }
}
