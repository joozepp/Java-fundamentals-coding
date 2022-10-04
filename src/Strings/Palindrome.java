package Strings;

import java.util.Scanner;

/**
 * To check a given word is a palindrome // to check if the word is the same word backwards /racecar, madam
 * @author Joozepp
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a word: ");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        //MADAM
        for(int i = word.length() - 1; i>= 0;i--){
            reverseWord.append(word.charAt(i));


        }

        if(word.equalsIgnoreCase(reverseWord.toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("this is not a palindrome");
        }
    }
}
