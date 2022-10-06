package Shopping;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Product fruit1 = new Product();
        fruit1.setName("Apple");
        fruit1.setPrice(14.00F);

        Product veg = new Product();
        veg.setName("Tomato");
        veg.setPrice(2.00F);

        Product food = new Product();
        food.setName("catfood");
        food.setPrice(200000000.00F);

        Product toilet = new Product();
        toilet.setName("scrubber");
        toilet.setPrice(20.00F);

        Product wife = new Product();
        wife.setName("wife");
        wife.setPrice(9.00F);

        Product[] products = {fruit1,veg,toilet,wife,food};

        for(int i = 0; i < products.length; i++) {
            System.out.println((i) + ". "+ products[i].getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose any product to add to cart:");
        int choice = scanner.nextInt();

    }


}
