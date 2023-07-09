package aula36_ExerciciosPDF;

import java.util.Scanner;

public class aula36_Exercicio02 {
	public static void main(String[] args) {

		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		
		Scanner sc = new Scanner(System.in);
				
		int number, rest;

		System.out.println("Por favor, informe um numero para verificação:");
		number = sc.nextInt();
		
		rest = number % 2;
		
		if (rest == 0) {
			System.out.println("Esse é um número par.");
		}
		else {
			System.out.println("Esse é um número ímpar.");
		}
				
		sc.close();
		
	}
}
