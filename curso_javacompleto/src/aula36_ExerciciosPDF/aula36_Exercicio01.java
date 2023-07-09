package aula36_ExerciciosPDF;

import java.util.Scanner;

public class aula36_Exercicio01 {
	public static void main(String[] args) {

		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo, positivo ou neutro.
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		
		Scanner sc = new Scanner(System.in);
				
		int numero;

		System.out.println("Por favor, informe um numero para verificação:");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Esse é um número positivo.");
		}
		else if (numero < 0) {
			System.out.println("Esse é um número negativo.");
		}
		else {
			System.out.println("Esse é um número neutro.");
		}
				
		sc.close();
		
	}
}
