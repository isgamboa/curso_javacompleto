package exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		
		/*Desafio 1: Calculadora de Idade
		Descrição: Crie um programa que receba uma data de nascimento no formato dd/MM/yyyy
		e calcule a idade exata da pessoa em anos, meses e dias.

		Requisitos:

		Utilize a classe LocalDate para representar datas.
		Calcule a diferença entre a data atual e a data de nascimento utilizando Period.
		Exiba a idade no formato: "Você tem X anos, Y meses e Z dias".*/
		
		Scanner sc = new Scanner(System.in);
		
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Informe a data de nascimento:");
		String informedBirthDate = sc.next();
		
		LocalDate birthDate = LocalDate.parse(informedBirthDate, formatter);
		
		/*System.out.println("Você tem " + 
		birthDate.until(currentDate, ChronoUnit.YEARS) + " anos, " + 
		birthDate.until(currentDate, ChronoUnit.MONTHS) + " meses e " +
		birthDate.until(currentDate, ChronoUnit.DAYS) + " dias");
		*/
		
        Period age = Period.between(birthDate, currentDate);
        
        System.out.println("Você tem " + 
            age.getYears() + " anos, " + 
            age.getMonths() + " meses e " + 
            age.getDays() + " dias.");
		
		sc.close();

	}

}