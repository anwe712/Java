package Inheritance;

public class CodeandPrice {
    import java.util.Scanner;

// Item class representing an item with code and price
class Item {
    private int code;
    private double price;

    // Constructor to initialize code and price of the item
    public Item(int code, double price) {
        this.code = code;
        this.price = price;
    }

    // Getter methods for code and price
    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}

// Main class
public class ItemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store five Item objects
        Item[] items = new Item[5];

        // Accept data for five items
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter code for item " + (i + 1) + ":");
            int code = scanner.nextInt();

            System.out.println("Enter price for item " + (i + 1) + ":");
            double price = scanner.nextDouble();

            // Create Item object and store in the array
            items[i] = new Item(code, price);
        }

        // Display items in tabular form
        System.out.println("\nCode\tPrice");
        System.out.println("--------------");
        double totalPrice = 0;
        for (Item item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
            totalPrice += item.getPrice();
        }

        // Display total price of all items
        System.out.println("\nTotal Price of all items: " + totalPrice);

        scanner.close();
    }
}

}
