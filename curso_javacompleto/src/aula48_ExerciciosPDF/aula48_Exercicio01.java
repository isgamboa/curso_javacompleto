package aula48_ExerciciosPDF;

import java.util.Scanner;

public class aula48_Exercicio01 {
	public static void main(String[] args) {

		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
		
		Scanner sc = new Scanner(System.in);
				
		int informedPassword, userPassword;
		
		System.out.println("Por favor, informe sua senha:");
		informedPassword = sc.nextInt();
		
		userPassword = 2002;

		//validação da senha informada
		
		while (informedPassword != userPassword) {
			System.out.println("Senha inválida. Tente novamente.");
			informedPassword = sc.nextInt();
		}
		
		System.out.println("Acesso permitido.");
	
		sc.close();
		
	}
}
