package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod1 = new Product();
		
		System.out.println("Enter with product data: ");
		System.out.print("Name: ");
		prod1.name = sc.nextLine();
		System.out.print("Price: ");
		prod1.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod1.quantity = sc.nextInt();
		
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
