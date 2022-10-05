package Strings;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a sentence");

        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());
    }
}
