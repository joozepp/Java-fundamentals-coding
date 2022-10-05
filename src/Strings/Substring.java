package Strings;

import java.util.Scanner;

/**
 * Write a program to check if the string has another string
 * find a match of strings
 */
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a random sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a search word: ");
        String searchWord = scanner.nextLine();

        if(sentence.contains(searchWord)) {
            System.out.println("Word matches");
        } else {
            System.out.println("word doesnt match");
        }

    }

}
