package aula66_application;

import java.util.Locale;
import java.util.Scanner;

import aula66_entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		//cadastra um novo produto
		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data " + product);
		System.out.println();
		
		//adiciona um novo produto
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated product data " + product);
		System.out.println();
		
		//remove um novo produto
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated product data " + product);
		System.out.println();
		
		sc.close();
	}

}
