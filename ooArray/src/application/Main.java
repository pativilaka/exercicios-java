package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] pro = new Produto[n];
		
		for (int i = 0; i < pro.length ; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			pro[i] = new Produto(name, price);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < pro.length; i++) {
			
			soma += pro[i].getPrice();
			
		}
		
		double media = soma / pro.length;
		
		System.out.printf("Media: %.2f", media);
		
		sc.close();		
		
	}

}
