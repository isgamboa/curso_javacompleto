package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio03 {
	public static void main(String[] args) {

		/**Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
		peso 5 */
		
		Scanner sc = new Scanner(System.in);
		
		double testCase1, testCase2, testCase3, weightedAverage = 0;
		int qttTestCases;
		
		System.out.println("Por favor, informe a quantidade de casos de teste que devem ser analisados:");
		qttTestCases = sc.nextInt();
		
		for (int i = 1; i <= qttTestCases; i++) {
		
			System.out.println("Por favor, informe os valores reais dos casos de teste:");
			testCase1 = sc.nextDouble();
			testCase2 = sc.nextDouble();
			testCase3 = sc.nextDouble();
			
			weightedAverage = ((testCase1 * 2 + testCase2 * 3 + testCase3 * 5) / 10);
			System.out.printf("A média ponderada é igual a: %.1f%n", weightedAverage);
		}
		
		sc.close();
		
	}
}