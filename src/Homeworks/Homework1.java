package Homeworks;

import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 *Given number 4
 * 4, 44, 444, 4444, 44444
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number and i'll show ya a trick");
        int numbah = scanner.nextInt();

        for(int i = 1; i <= numbah; i++){  // to print number of times/lines (4)
            for(int j = 1; j <= i; j++){   // print the number of digits

            System.out.print(numbah);
            }
            System.out.println();

        }
    }
}
