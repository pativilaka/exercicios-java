package estruturaRepetitiva;

import java.util.Scanner;

public class WhileExercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0 ) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			
		}
		
		sc.close();

	}

}
