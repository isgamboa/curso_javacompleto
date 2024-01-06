package aula69Exercicio2_application;

import java.util.Locale;
import java.util.Scanner;

import aula69Exercicio2_entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		System.out.println("Please enter the employee's details: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println("Employee: " + employee);
		
		System.out.print("Wich percentage to increase salary?");
		Double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated employee data: " + employee);
		
		sc.close();

	}

}
