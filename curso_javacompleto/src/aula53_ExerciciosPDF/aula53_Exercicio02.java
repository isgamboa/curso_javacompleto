package aula53_ExerciciosPDF;

import java.util.Scanner;

public class aula53_Exercicio02 {
	public static void main(String[] args) {

		/**Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java */
		
		Scanner sc = new Scanner(System.in);
		
		int qttNumbers, number, in = 0, out = 0;
		
		System.out.println("Por favor, informe a quantidade de números que devem ser analisados:");
		qttNumbers = sc.nextInt();
		
		for (int i = 1; i <= qttNumbers; i++) {
		
			System.out.println("Por favor, informe um numero a ser analisado:");
			number = sc.nextInt();
			if (number >= 10 && number <= 20) {
				in++;
				}
			else out++;
		}
		
		System.out.println("Quantidade de números dentro do intervalo [10,20]: " + in + "\n"
				+ "Quantidade de números fora do intervalo [10,20]: " + out);
		
		sc.close();
		
	}
}
