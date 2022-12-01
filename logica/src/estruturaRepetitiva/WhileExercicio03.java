package estruturaRepetitiva;

import java.util.Scanner;

public class WhileExercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		 * exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int pref;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		pref = sc.nextInt();
		
		while (pref != 4) {
			
			if (pref == 1) {
				
				alcool += 1;
				
			} else if (pref == 2) {
				
				gasolina += 1;
				
			} 
			else if (pref == 3){
				
				diesel += 1;
				
			}
			
			pref = sc.nextInt();
						
		}
		
		
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}

}
