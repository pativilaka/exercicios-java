package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ForExercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		for (int i = 0; i < n; i++) {
			
			double num = sc.nextDouble();
			double den = sc.nextDouble();
			
			if (den == 0) {
				System.out.println("Divisao impossivel");
			} else {
				double result = num / den;
				System.out.printf("%.1f%n", result);
			}
			
		}
		
		sc.close();
		
	}

}
