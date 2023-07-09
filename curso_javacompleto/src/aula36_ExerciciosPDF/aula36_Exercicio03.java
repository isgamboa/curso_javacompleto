package aula36_ExerciciosPDF;

import java.util.Scanner;

public class aula36_Exercicio03 {
	public static void main(String[] args) {

		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		
		Scanner sc = new Scanner(System.in);
				
		int numberA, numberB, rest;

		System.out.println("Por favor, informe o primeiro número");
		numberA = sc.nextInt();

		System.out.println("Por favor, informe o segundo número");
		numberB = sc.nextInt();
		
		if (numberB > numberA) {
			rest = numberB % numberA;
		}
		else {
			rest = numberA % numberB;
		}		
		
		if (rest == 0) {
			System.out.println("Os números informados são múltiplos.");
		}
		else {
			System.out.println("Os números informados não são múltiplos");
		}
				
		sc.close();
		
	}
}
