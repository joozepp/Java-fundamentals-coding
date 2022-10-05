package Strings;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your first name");
        String fname = scanner.nextLine();

        System.out.println("enter your last name");
        String lName = scanner.nextLine();

        String fullName= fname.concat(" ").concat(lName);
        System.out.println(fullName);
    }
}
