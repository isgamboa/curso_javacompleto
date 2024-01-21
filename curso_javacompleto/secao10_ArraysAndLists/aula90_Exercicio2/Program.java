package aula90_Exercicio2;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;


public class Program {

	public static void main(String[] args) {
		
		//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
		//- Imprimir todos os elementos do vetor 
		//- Mostrar na tela a soma e a média dos elementos do vetor 
		//Correção disponível em: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos números você vai digitar? ");
		int totalNumbers = sc.nextInt();
		
		double vector[] = new double[totalNumbers];
		
		for (int i=0; i<vector.length; i++) {
			System.out.println("Digite um número: ");
			vector[i] = sc.nextDouble();
		}
		
		System.out.println("VALORES: " + Arrays.toString(vector));

		double sum = 0;
		for (int i=0; i<vector.length; i++) {
			sum += vector[i];  
		}
		System.out.println("SOMA: " + sum);
		System.out.println("MÉDIA: " + sum / vector.length);
		
		sc.close();

	}

}
