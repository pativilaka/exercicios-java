package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Enter with product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
			
		
		Product prod1 = new Product(name, price);
		
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + prod1);
		
		System.out.println();
		System.out.print("Enter with the number of products to be add in stock: ");
		int prod1Alt = sc.nextInt();
		prod1.addProducts(prod1Alt);
		System.out.println("Update data: " + prod1);
		
		System.out.println();
		System.out.print("Enter with the number of products to be removed from stock: ");
		prod1Alt = sc.nextInt();
		prod1.removeProducts(prod1Alt);
		System.out.println("Update data: " + prod1);
		
		sc.close();
		
	}

}
