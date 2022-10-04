package Basics;

import java.util.Scanner;

/**
 * To get input from user and print it.
 *
 * @author Joozepp
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("This is my first exercise!");
        //To get input from user
        Scanner scanner = new Scanner(System.in); //scanner on inputi saamiseks. System.in on inputi saamiseks väga vajalik

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");




        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Do you live in Tallinn? Please type true or false.");
        boolean isLivingInTallinn = scanner.nextBoolean();

        System.out.println("Age is: " + age);
        System.out.println("Am i living in tallinn:"+isLivingInTallinn);



    }
}
