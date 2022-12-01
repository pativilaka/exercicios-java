package application;

import java.util.Locale;
import java.util.Scanner;

import util.Cambio;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		
		double total = Cambio.currencyConverter(dollarPrice, dollar);
		System.out.printf("Amount to be paid in reais = R$ %.2f", total);
		
		sc.close();

	}

}
