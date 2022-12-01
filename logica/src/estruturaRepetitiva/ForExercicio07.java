package estruturaRepetitiva;

import java.util.Scanner;

public class ForExercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

				int quadrado = (int) Math.pow(i, 2);
				int cubo = (int) Math.pow(i, 3); 
				System.out.print(i + " " + quadrado + " " + cubo);
				System.out.println();
			
		}
		
		sc.close();

	}

}
