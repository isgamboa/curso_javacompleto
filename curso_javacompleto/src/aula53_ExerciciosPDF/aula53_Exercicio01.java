package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio01 {
	public static void main(String[] args) {

		/**Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java */
		
		Scanner sc = new Scanner(System.in);
				
		int number;
		
		System.out.println("Por favor, informe o número a ser analisado:");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
		
			if (i % 2 != 0) {System.out.println(i);}
		}
		
		sc.close();
		
	}
}
