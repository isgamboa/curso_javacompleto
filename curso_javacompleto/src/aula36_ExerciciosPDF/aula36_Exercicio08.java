package aula36_ExerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class aula36_Exercicio08 {
	public static void main(String[] args) {

		//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		//Renda até R$2000,00 = Isento;
		//Renda de R$2000,01 até R$3000,00 = 8%;
		//Renda de R$3000,01 até 4500,00 = 18%;
		//Renda acima de R$4500 = 28%;
		//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido, a taxa é
		//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		//duas casas decimais.

		//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
		
		//Commitado no Git
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		double tierTax1, tierTax2 = 0, tierTax3 = 0, tierTax4 = 0, totalTaxDue, wage;
		
		System.out.println("Por favor, informe o salário para que possamos calcular o imposto de renda devido:");
		wage = sc.nextDouble();

		//cálculo do imposto devido na faixa 1
		
		tierTax1 = 0;
		
		if (wage <= 2000) {
			System.out.println("O contribuinte está isento do pagamento de imposto de renda.");
			sc.close();
			return;
		}
		
		//cálculo do imposto devido na faixa 2
		
		if (wage > 2000 && wage <= 3000) {
			tierTax2 = (wage - 2000) * 0.08;
		}
		else tierTax2 = (3000 - 2000.01) * 0.08;
		
		//calculo do imposto devido na faixa 3
		
		if (wage > 3000 && wage <= 4500) {
			tierTax3 = (wage - 3000) * 0.18;
		}
		else tierTax3 = (4500 - 3000.01) * 0.18;

		//calculo do imposto devido na faixa 4
		
		if (wage > 4500) {
			tierTax4 = (wage - 4500) * 0.28;
		}
		
		totalTaxDue = tierTax1 + tierTax2+ tierTax3 + tierTax4;
		
		System.out.printf("O imposto total devido é R$%.2f", totalTaxDue);
		
		sc.close();
		
	}
}
