package aula72Exercicio_Application;

import java.util.Locale;
import java.util.Scanner;

import aula72Exercicio_entities.Utilities;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		Utilities.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		Utilities.dollarQuantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in Reais (R$) = %.2f", Utilities.currencyConverter());
	
		sc.close();
	}
}
