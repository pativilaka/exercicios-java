package estruturaCondicional;

import java.util.Scanner;

public class IfExercicio01 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Nao negativo");
		}
		
		sc.close();
	}

}
