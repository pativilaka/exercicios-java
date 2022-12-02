package array;

import java.util.Locale;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		double[] altura = new double[n];
		
		double media = 0.0;
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			
			altura[i] = sc.nextDouble();
			soma += altura[i];
			
		}
		
		media = soma / n;
		
		System.out.printf("Average height: %.2f", media);		
		
		sc.close();

	}

}
