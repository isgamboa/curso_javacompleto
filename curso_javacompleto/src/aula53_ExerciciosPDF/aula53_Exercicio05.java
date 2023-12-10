package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio05 {
	public static void main(String[] args) {

		/**Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por definição, fatorial de 0 é 1. */
		
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
		
		Scanner sc = new Scanner(System.in);
		
		int qttTestCases, testCase, factorial = 1;
		
		System.out.println("Por favor, informe a quantidade de fatoriais que serão calculados:");
		qttTestCases = sc.nextInt();
		
		for (int i = 1; i <= qttTestCases; i++) {
		
			System.out.println("Por favor, informe o número que terá seu fatorial calculado:");
			testCase = sc.nextInt();
			factorial = 1;
			
			for (int n = 1; n <= testCase; n++) {
				factorial = factorial * n;
			}
			System.out.println("O fatorial é igual a: " + factorial);
		}
		
		sc.close();
		
	}
}