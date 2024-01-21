package aula90_Exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		//Correção disponível em: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
		
		Scanner sc = new Scanner(System.in);
		
		int totalNumbers = sc.nextInt();
		
		System.out.println("Quantos números você vai digitar? ");
		
		int vector[] = new int[totalNumbers];
		
		for (int i=0; i<vector.length; i++) {
			System.out.println("Digite um número: ");
			vector[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<vector.length; i++) {
			if (vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
		
		sc.close();
		
	}

}
