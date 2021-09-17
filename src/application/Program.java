package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Update Name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update Price: $" + product.getPrice());
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quant = sc.nextInt();
		product.addProducts(quant);
		
		System.out.println();
		System.out.println("Update Data: " + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quant = sc.nextInt();
		product.removeProducts(quant);
		
		System.out.println();
		System.out.println("Update Data: " + product);
		
		sc.close();
	}

}
