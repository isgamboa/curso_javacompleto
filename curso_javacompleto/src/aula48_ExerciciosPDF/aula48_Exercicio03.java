package aula48_ExerciciosPDF;

import java.util.Scanner;

public class aula48_Exercicio03 {
	public static void main(String[] args) {

		/**Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
		exemplo.
		Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java */
		
		Scanner sc = new Scanner(System.in);
			
		int favoriteProduct, ethanol = 0, gasoline = 0, diesel = 0;
		
		System.out.println("Por favor, informe seu combustível favorito entre as opções:\n"
				+ "1 - Álcool" + "\n"
				+ "2 - Gasolina" + "\n"
				+ "3 - Diesel" + "\n"
				+ "ou digite 4 para encerrar a pesquisa.");
		favoriteProduct = sc.nextInt();

			while (favoriteProduct != 4) {
				
				while (favoriteProduct > 4 || favoriteProduct <1) {
					System.out.println("Favor informar um produto válido. As opções são:\n"
							+ "1 - Álcool\n"
							+ "2 - Gasolina\n"
							+ "3 - Diesel\n"
							+ "ou digite 4 para encerrar a pesquisa.");
					favoriteProduct = sc.nextInt();
					}
				
				if (favoriteProduct == 1) {
					ethanol++;
				}
				else if (favoriteProduct == 2) {
					gasoline++;
				}
				else if (favoriteProduct == 3) {
					diesel++;
				}
				
				System.out.println("Por favor, informe seu combustível favorito entre as opções:\n"
						+ "1 - Álcool\n"
						+ "2 - Gasolina\n"
						+ "3 - Diesel\n"
						+ "ou digite 4 para encerrar a pesquisa.");
				favoriteProduct = sc.nextInt();
			}
				
		System.out.println("Muito obrigado! Confira o resultado da pesquisa:\n"
				+ "Álcool = " + ethanol + "\n"
				+ "Gasolina = " + gasoline + "\n"
				+ "Diesel = " + diesel + "\n");
			
		sc.close();
		
	}
}
