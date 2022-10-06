package Shopping;

import java.util.Scanner;

/**
 * Create a class product,it should contain at least two fields- name and price
 * Create an empty array of products - its size should be at least 5
 * populate the array with some products- this array represents the menu for the user.
 *
 * simulate the process of doing shopping:
 * ask for a product,
 * add it to the cart ( array)
 * change index,
 * if index will be greater than 5 - finish shopping,
 * pay for the products.
 */

public class Product {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}
