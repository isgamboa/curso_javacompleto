package aula29_ExerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class aula29_Exercicio05 {
	public static void main(String[] args) {

		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		//Correção disponível em: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int itemId, quantity;
		float itemPrice, totalAmount;
		
		System.out.println("Por favor, informe o código do produto");
		itemId = sc.nextInt();
		
		System.out.println("Por favor, informe a quantidade de itens do produto código " + itemId + ":");
		quantity = sc.nextInt();
		
		System.out.println("Por favor, informe o valor unitário do produto código " + itemId + ":");
		itemPrice = sc.nextFloat();
		
		totalAmount = itemPrice * quantity;
					
		System.out.println("Por favor, informe o código do próximo produto");
		itemId = sc.nextInt();
		
		System.out.println("Por favor, informe a quantidade de itens do produto código " + itemId + ":");
		quantity = sc.nextInt();
		
		System.out.println("Por favor, informe o valor unitário do produto código " + itemId + ":");
		itemPrice = sc.nextFloat();
		
		totalAmount = totalAmount + (itemPrice * quantity);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", totalAmount);
				
		sc.close();
		
	}
}
