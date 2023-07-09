package aula36_ExerciciosPDF;

import java.util.Scanner;
import java.util.Locale;

public class aula36_Exercicio05 {
	public static void main(String[] args) {

		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		// Codigo / Especificação / Preço
		// 1 / Cachorro quente / R$4,00
		// 2 / X-Salada / R$4,50
		// 3 / X-Bacon / R$5,00
		// 4 / Torrada Simples / R$2,00
		// 5 / Refrigerante / R$1,50
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int productCode, productQuantity;
		double amount;
		
		String productName [] = {"Cachorro quente", "X-salada", "X-Bacon", "Torrada Simples", "Refrigerante"};
		double productPrice [] = {4, 4.5, 5, 2.0, 1.5};
		
		System.out.println("Por favor, informe o código do produto:");
		productCode = sc.nextInt();

		System.out.println("Por favor, informe a quantidade do produto " + productName[productCode - 1] + ":");
		productQuantity = sc.nextInt();
		
		amount = productQuantity * productPrice[productCode - 1];
		
		System.out.printf("Total a pagar: R$%.2f", amount);
				
		sc.close();
		
	}
}
