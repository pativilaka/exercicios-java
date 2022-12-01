package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class IfExercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		 * seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * COD  // ESPECIFICACAO  // PRECO
		 * 1	  CACHORRO QUENTE   4.00
		 * 2 	  X-SALADA  		4.50
		 * 3	  X-BACON			5.00
		 * 4	  TORRADA SIMPLES	2.00
		 * 5 	  REFRIGERANTE		1.50	
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtde;
		double total;
		
		cod = sc.nextInt();
		qtde = sc.nextInt();
		
		if (cod == 1) {
			total = qtde * 4;
		} else if (cod == 2) {
			total = qtde * 4.5;
		} else if (cod == 3) {
			total = qtde * 5;
		} else if (cod == 4) {
			total = qtde * 2;
		} else {
			total = qtde * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);		
		
		sc.close();

	}

}
