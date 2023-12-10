package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio07 {
	public static void main(String[] args) {

		/**Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
		exemplo. */
		
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
		
		Scanner sc = new Scanner(System.in);
		
		int number, lineSquare, lineCube;
		
		System.out.println("Por favor, informe o número a ser analisado:");
		number = sc.nextInt();
		
		for (int line = 1; line <= number; line++) {
		
			lineSquare = (int) Math.pow(line,2);
			lineCube = (int) Math.pow(line, 3);
			System.out.printf("%d %d %d%n", line, lineSquare, lineCube);
		}
		
		sc.close();
		
	}
}