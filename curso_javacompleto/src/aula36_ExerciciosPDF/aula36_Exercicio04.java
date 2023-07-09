package aula36_ExerciciosPDF;

import java.util.Scanner;

public class aula36_Exercicio04 {
	public static void main(String[] args) {

		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
		
		Scanner sc = new Scanner(System.in);
				
		int startTime, finishTime, duration;

		System.out.println("Por favor, informe a hora do início do jogo:");
		startTime = sc.nextInt();

		System.out.println("Por favor, informe a hora do término do jogo:");
		finishTime = sc.nextInt();
		
		if (finishTime <= startTime) {
			finishTime = finishTime + 24;
		}
		
		duration = finishTime - startTime; 
		
		System.out.println("O jogo durou " + duration + " horas.");
				
		sc.close();
		
	}
}
