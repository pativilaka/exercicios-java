package application;

import java.util.Locale;
import java.util.Scanner;

import util.Circumference;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
				
		System.out.printf("Circumference %.2f%n", Circumference.circumference(radius));
		System.out.printf("Volume: %.2f%n", Circumference.volume(radius));
		System.out.printf("Valor de PI: %.2f%n", Circumference.PI);
		
		sc.close();

	}

}
