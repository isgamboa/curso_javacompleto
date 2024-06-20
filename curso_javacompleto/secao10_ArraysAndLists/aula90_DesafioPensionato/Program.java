package aula90_DesafioPensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

			//Problema "Desafio Pensionato" 
			//Correção: https://www.udemy.com/course/java-curso-completo/learn/lecture/10566114#overview
			//A dona de um pensionato possui dez quartos para alugar para estudantes,
			//sendo esses quartos identificados pelos números 0 a 9.
			//Fazer um programa que inicie com todos os dez quartos vazios, e depois 
			//leia uma quantidade N representando o número de estudantes que vão
			//alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
			//N estudantes. Para cada registro de aluguel, informar o nome e email do
			//estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
			//que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
			//um relatório de todas ocupações do pensionato, por ordem de quarto,
			//conforme exemplo
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented?");
		int totalNumber = sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<totalNumber;i++) {
			
			System.out.println("Rent #" + (i + 1) + ":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms ");
		for (int i=0;i<10;i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
				
			}
		}
		sc.close();

	}
}