package estruturaRepetitiva;

import java.util.Scanner;

public class ForExercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */

		Scanner sc = new Scanner(System.in);
		
		int n, valorX;
		int in = 0;
		int out = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			valorX = sc.nextInt();
			
			if (valorX >= 10 && valorX <= 20) {
				in += 1;
			} else {
				out += 1;
			}
								
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
	}

}
