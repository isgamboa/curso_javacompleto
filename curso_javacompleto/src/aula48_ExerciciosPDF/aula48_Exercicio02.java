/**
 * 
 */
package aula48_ExerciciosPDF;

import java.util.Scanner;

/**
 * 
 */
public class aula48_Exercicio02 {
	public static void main(String[] args) {

		/**Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java */
		
		Scanner sc = new Scanner(System.in);
			
		double xValue, yValue;
		
		System.out.println("Por favor, informe a posição do ponto no eixo X:");
		xValue = sc.nextDouble();

		System.out.println("Por favor, informe a posição do ponto no eixo Y:");
		yValue = sc.nextDouble();
		
		while (xValue != 0 && yValue != 0) {
			
			if (xValue < 0 && yValue < 0) {
				System.out.println("As coodernadas pertencem ao quadrante Q3 do plano cartesiano.");
				
				System.out.println("Por favor, informe a posição do ponto no eixo X:");
				xValue = sc.nextDouble();

				System.out.println("Por favor, informe a posição do ponto no eixo Y:");
				yValue = sc.nextDouble();
			}
			else if (xValue < 0 && yValue > 0) {
				System.out.println("As coodernadas pertencem ao quadrante Q2 do plano cartesiano.");
				
				System.out.println("Por favor, informe a posição do ponto no eixo X:");
				xValue = sc.nextDouble();

				System.out.println("Por favor, informe a posição do ponto no eixo Y:");
				yValue = sc.nextDouble();
			}
			else if (xValue > 0 && yValue < 0) {
				System.out.println("As coodernadas pertencem ao quadrante Q4 do plano cartesiano.");
				
				System.out.println("Por favor, informe a posição do ponto no eixo X:");
				xValue = sc.nextDouble();

				System.out.println("Por favor, informe a posição do ponto no eixo Y:");
				yValue = sc.nextDouble();
			}
			else {
				System.out.println("As coodernadas pertencem ao quadrante Q1 do plano cartesiano.");
				
				System.out.println("Por favor, informe a posição do ponto no eixo X:");
				xValue = sc.nextDouble();

				System.out.println("Por favor, informe a posição do ponto no eixo Y:");
				yValue = sc.nextDouble();
			}
		}
		
		sc.close();
		
	}
}
