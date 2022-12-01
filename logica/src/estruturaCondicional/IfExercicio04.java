package estruturaCondicional;

import java.util.Scanner;

public class IfExercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal, duracao;
		
		horaInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicio >= horaFinal) {
			duracao = (24 - horaInicio + horaFinal);
		} else {
			duracao = horaFinal - horaInicio;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
