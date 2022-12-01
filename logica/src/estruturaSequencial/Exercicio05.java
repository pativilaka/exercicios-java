package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double valUnit1, valUnit2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valUnit1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valUnit2 = sc.nextDouble();
		
		total = qtd1 * valUnit1 + qtd2 * valUnit2;
		
		System.out.println("Códigos dos produtos: " + cod1 + " e " + cod2);
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
		
	} 

}
