package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		 * decimais
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, horasTrabalhadas;
		double salarioHora, totalSalario;
		
		numFunc = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		totalSalario = horasTrabalhadas * salarioHora;
		
		System.out.println("Numero funcionario: " + numFunc);
		System.out.printf("Salario U$ %.2f%n", totalSalario);
		
		sc.close();
		
	}

}
