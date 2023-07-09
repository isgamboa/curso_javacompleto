package aula29_ExerciciosPDF;
import java.util.Scanner;

public class aula29_Exercicio03 {
	public static void main(String[] args) {

		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		//Correção disponível em: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Por favor, informe o valor de A:");
		A = sc.nextInt();
		
		System.out.println("Por favor, informe o valor de B:");
		B = sc.nextInt();
		
		System.out.println("Por favor, informe o valor de C:");
		C = sc.nextInt();
		
		System.out.println("Por favor, informe o valor de D:");
		D = sc.nextInt();
		
		System.out.println("Diferença = " + (A * B - C * D));
				
		sc.close();
		
	}
}