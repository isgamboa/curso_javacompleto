package aula29_ExerciciosPDF;
import java.util.Scanner;
import java.util.Locale;

public class aula29_Exercicio04 {
	public static void main(String[] args) {

		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		//Correção disponível em: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int employeeNumber;
		float workedHours, hourValue, salary;
		
		System.out.println("Por favor, informe o número do funcionário:");
		employeeNumber = sc.nextInt();
		
		System.out.println("Por favor, informe a quantidade de horas trabalhadas pelo funcionário " + employeeNumber + ":");
		workedHours = sc.nextFloat();
		
		System.out.println("Por favor, informe o valor da hora trabalhada do funcionário " + employeeNumber + ":");
		hourValue = sc.nextFloat();
		
		salary = workedHours * hourValue;
				
		System.out.printf("Número do funcionário: %s%n"
				+ "Salário: U$ %.2f", employeeNumber, salary);
				
		sc.close();
		
	}
}
