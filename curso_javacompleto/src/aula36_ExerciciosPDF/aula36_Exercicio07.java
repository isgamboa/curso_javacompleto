package aula36_ExerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class aula36_Exercicio07 {
	public static void main(String[] args) {

		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		//Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		double xValue, yValue;
		
		System.out.println("Por favor, informe a posição do ponto no eixo X:");
		xValue = sc.nextDouble();

		System.out.println("Por favor, informe a posição do ponto no eixo Y:");
		yValue = sc.nextDouble();
		
		if (xValue == 0 && yValue == 0) {
			System.out.println("As coodernadas estão localizadas na origem do plano cartesiano.");
		}
		else if (xValue == 0) {
			System.out.println("As coordena estão localizadas no eixo X do plano cartesiano");
		}
		else if (yValue == 0) {
			System.out.println("As coordena estão localizadas no eixo Y do plano cartesiano");
		}
		else if (xValue < 0 && yValue < 0) {
			System.out.println("As coodernadas pertencem ao quadrante Q3 do plano cartesiano.");
		}
		else if (xValue < 0 && yValue > 0) {
			System.out.println("As coodernadas pertencem ao quadrante Q2 do plano cartesiano.");
		}
		else if (xValue > 0 && yValue < 0) {
			System.out.println("As coodernadas pertencem ao quadrante Q4 do plano cartesiano.");
		}
		else {
			System.out.println("As coodernadas pertencem ao quadrante Q1 do plano cartesiano.");
		}
		
		sc.close();
		
	}
}
