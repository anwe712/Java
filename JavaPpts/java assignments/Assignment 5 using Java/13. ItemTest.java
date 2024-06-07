/* WAP in Java to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display total price of all items. */

import java.util.Scanner;

class Item 
{
   	int code;
   	double price;
	Item() 
	{
        	code = 0;
        	price = 0.0;
    	}
	Item(int code, double price) 
	{
        	this.code = code;
        	this.price = price;
    	}
	double getPrice() 
	{
        	return price;
    	}
	void displayItem() 
	{
        	System.out.println(code + "\t" + price);
    	}
}

public class ItemTest 
{
	public static void main(String[] args) 
	{
        	Scanner in = new Scanner(System.in);
        	Item[] items = new Item[5];

        	System.out.println("Enter code and price for five items:");
        	for (int i = 0; i < 5; i++) 
		{
            		System.out.println("Enter code for item " + (i + 1) + ":");
            		int code = in.nextInt();
            		System.out.println("Enter price for item " + (i + 1) + ":");
            		double price = in.nextDouble();
			items[i] = new Item(code, price);
        	}
        	System.out.println("Code\tPrice");
        	for (Item item : items) 
		{
            		item.displayItem();
        	}

        	double total = 0;
        	for (Item item : items) 
		{
            		total += item.getPrice();
        	}
        	System.out.println("Total price of all items: " + total);

        	in.close();
    	}
}
