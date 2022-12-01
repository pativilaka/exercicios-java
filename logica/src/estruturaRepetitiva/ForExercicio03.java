package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ForExercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		 * peso 5.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double val1, val2, val3, mediaPonderada;
		
		int n = sc.nextInt();
			
		for (int i = 0; i < n; i++) {
			
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			val3 = sc.nextDouble();
			
			mediaPonderada = (val1*2 + val2*3 + val3*5) / 10;
			
			System.out.printf("%.1f%n", mediaPonderada);
			
		}
		
		
		sc.close();

	}

}
