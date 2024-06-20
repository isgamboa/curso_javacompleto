package aula100Exercicio_application;

import java.util.Locale;
import java.util.Scanner;

import aula100Exercicio_entities.Employees;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		//Problema "Exercício de fixação" 
		//Correção: https://github.com/acenelio/list1-java
		//Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
		//N funcionários. Não deve haver repetição de id.
		//Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
		//Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
		//mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
		//Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		//ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
		//aumento por porcentagem dada
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int totalEmployees, id;
		String name;
		Double wage, percentage;
		String idCheck = "false";
		List<Employees> employeeList = new ArrayList<Employees>();
		
		
		System.out.print("How many empolyees will be registered?");
		totalEmployees = sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<totalEmployees;i++){
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			
			for (Employees x : employeeList ) {
				Integer employeeId = x.getId();
				if (employeeId.equals(id)) {
					System.out.println("There's already a employee with this ID. Please, start again with another ID");
					System.exit(0);
				
				}
			}
						
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			wage = sc.nextDouble();
			
			Employees employee = new Employees(id, name, wage);
			employeeList.add(employee);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		id = sc.nextInt();
		sc.nextLine();

		for (Employees x : employeeList ) {
			if (id == x.getId()){
				idCheck = "true";
				System.out.println();
				System.out.print("Enter the percentage of increase: ");
				percentage = sc.nextDouble();		
				x.increaseWage(percentage);
				break;
			}
		}
				
		if (idCheck == "false") {
			System.out.println("This id does not exist!");
		}
					
		System.out.println();
		System.out.println("List of employees:");
		for (Employees x : employeeList ) {
			if(x != null) {
				System.out.println(x);		
			}
		}
		
		sc.close();
	}
}
