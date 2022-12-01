package estruturaRepetitiva;

import java.util.Scanner;

public class ForExercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
				
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			
			fatorial = fatorial * i;
			
		}
		
		System.out.println(fatorial);
		
		sc.close();
		
	}

}
