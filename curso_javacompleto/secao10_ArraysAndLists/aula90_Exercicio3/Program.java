package aula90_Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

			//Problema "alturas" 
			//Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
			//Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na 
			//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
			//bem como os nomes dessas pessoas caso houver. Deve-se utilizar um array para cada atributo.
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serão inseridas no sistema? ");
		int totalNumber = sc.nextInt();
		sc.nextLine();
		
		String[] name = new String[totalNumber];
		int[] age = new int[totalNumber];
		double[] height = new double[totalNumber];
		
		for (int i=0;i<totalNumber;i++) {
			
			System.out.println("Informe os dados da " + (i + 1) + "a pessoa:");
			
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			sc.nextLine();

		}
		
		System.out.print("Altura média: ");
		double totalHeight = 0;
		for (int i=0;i<totalNumber;i++) {
			totalHeight += height[i];
		}
		System.out.println(totalHeight / totalNumber);
		
		System.out.print("Pessoas com menos de 16 anos: ");
		int under16 = 0;
		for (int i=0;i<totalNumber;i++) {
			if (age[i] < 16) {
				under16 += 1;
			}
		}
		System.out.println(((under16 *100) / totalNumber) + "%");
		
		for (int i=0;i<totalNumber;i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}
}
