package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program2 {

	public static void main(String[] args) {

		int feedback;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Product data: \n");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		//System.out.print("Quantity in stock: ");
	    //int quantity = sc.nextInt();
		
		Product product = new Product(name, price);

		System.out.println("\nProduct data: " + product);

		do {

			System.out.println("\nAdd or remove products?\n1 - Add\n2 - Remove\n");
			feedback = sc.nextInt();

			switch (feedback) {
			case 1:

				System.out.println("\nUnits to be added: ");
			    int quantity = sc.nextInt();
				product.AddProducts(quantity);
				break;

			case 2:

				System.out.println("\nUnits to be decreased: ");
				quantity = sc.nextInt();
				product.RemoveProducts(quantity);
				break;

			case 999:
				
				System.out.println("Finishing...");
				break;
				
			default:
				
				System.out.println("No changes were made");
				break;

			}
			System.out.println("\nProduct data: " + product);

		} while (feedback != 999);
		
		System.out.println("Current product data: " + product);
		
		sc.close();
	}
}
