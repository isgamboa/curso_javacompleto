package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio06 {
	public static void main(String[] args) {

		/**Ler um número inteiro N e calcular todos os seus divisores */
		
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Por favor, informe o número a ser analisado:");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
		
			if (number % i == 0) {
				System.out.println(i);				
			}
		}
		
		sc.close();
		
	}
}