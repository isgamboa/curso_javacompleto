package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio04 {
	public static void main(String[] args) {

		/**Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
		
		Scanner sc = new Scanner(System.in);
		
		double testCase1, testCase2, quotient = 0;
		int qttTestCases;
		
		System.out.println("Por favor, informe a quantidade de divisões que deverão ser realizadas:");
		qttTestCases = sc.nextInt();
		
		for (int i = 1; i <= qttTestCases; i++) {
		
			System.out.println("Por favor, informe os números que serão divididos:");
			testCase1 = sc.nextDouble();
			testCase2 = sc.nextDouble();
			
			if (testCase2 == 0) {
				System.out.println("Divisão impossível, pois o denominador é igual a zero");
			}
			else { quotient = (testCase1 / testCase2);
			System.out.printf("O quociente da divisão é igual a: %.1f%n", quotient);
			}
		}
		
		sc.close();
		
	}
}