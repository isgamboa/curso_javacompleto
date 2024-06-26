package aula104ExercicioMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler dois números inteiros M e N, e depois ler 
		uma matriz de M linhas por N colunas contendo números inteiros,
		podendo haver repetições. Em seguida, ler um número inteiro X que
		pertence à matriz. Para cada ocorrência de X, mostrar os valores à
		esquerda, acima, à direita e abaixo de X, quando houver, conforme
		exemplo*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linhas e em seguida a quantidade de colunas da matriz:");
		int l = sc.nextInt();
		int c = sc.nextInt();
		int mat [][] = new int[l][c];
		
		
		System.out.println("Agora digite os valores da matriz de " + l + " linhas e " + c + " colunas:");
		for (int i=0;i<l;i++) {
			for (int j=0;j<c;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe um número a ser buscado na matriz:");
		int num = sc.nextInt();
		
		for (int i=0;i<l;i++) {
			for (int j=0;j<c;j++) {
				if (num == mat[i][j]) {
					System.out.println("Posição: " + i + "," + j + ":");
					
					if (j!=0) {System.out.println("Esquerda: " + mat[i][j-1]);}
					if (j!=c-1) {System.out.println("Direita: " + mat[i][j+1]);}
					if (i!=0) {System.out.println("Acima: " + mat[i-1][j]);}
					if (i!=l-1) {System.out.println("Abaixo: " + mat[i+1][j]);}
				}
			}
		}
	
		sc.close();

	}

}