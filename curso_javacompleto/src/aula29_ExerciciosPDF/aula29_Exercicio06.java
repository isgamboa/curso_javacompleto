package aula29_ExerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class aula29_Exercicio06 {
	public static void main(String[] args) {

		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B
		//Correção disponível em: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		double a, b, c, pi, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;
		
		pi = 3.14159;
		
		System.out.println("Por favor, informe os valores de A, B e C:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();		
		
		triangleArea = (a * c)/2;
		
		circleArea = Math.pow(c, 2) * pi;
		
		trapezeArea = ((a + b)*c)/2;
		
		squareArea = b * b;
		
		rectangleArea = a * b;
		
		System.out.printf("Área do triângulo: %.3f%n"
				+ "Área do circulo: %.3f%n"
				+ "Área do trapézio: %.3f%n"
				+ "Área do quadrado: %.3f%n"
				+ "Área do retângulo: %.3f", triangleArea, circleArea, trapezeArea, squareArea, rectangleArea);
		
		sc.close();
		
	}
}