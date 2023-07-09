package aula36_ExerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class aula36_Exercicio06 {
	public static void main(String[] args) {

		//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		double value;
		
		System.out.println("Por favor, informe o valor a ser analisado:");
		value = sc.nextDouble();

		if (value < 0 || value > 100) {
			System.out.println("Fora do intervalo");
		}
		else if (value <= 25) {
			System.out.println("O valor informado pertence ao intervalo [0,25].");
		}
		else if (value <= 50) {
			System.out.println("O valor informado pertence ao intervalo (25,50].");
		}
		else if (value <= 75) {
			System.out.println("O valor informado pertence ao intervalo (50,75].");
		}
		else {
			System.out.println("O valor informado pertence ao intervalo (75,100].");
		}
						
		sc.close();
		
	}
}
