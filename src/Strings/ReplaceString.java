package Strings;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string");
        String xd = scanner.nextLine();

        boolean isMatch = false;
        String source = null;

        while (!isMatch) {
            System.out.println("Which string to replace? ");
            source = scanner.nextLine();

            if (xd.contains(source)) {
                isMatch = true;
            } else {
                System.out.println("string not found");
            }
        }


        System.out.println("enter a replacement string:");
        String destination = scanner.nextLine();


        // String result = xd.replace(source, destination);

        String result = xd.replaceAll("\\d", destination);
        System.out.println(result);


    }
}