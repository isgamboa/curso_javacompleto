package aula69Exercicio3_application;

import java.util.Locale;
import java.util.Scanner;

import aula69Exercicio3_entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Please enter the student data");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Q1 Grade: ");
		student.q1Grade = sc.nextDouble();
		System.out.print("Q2 Grade: ");
		student.q2Grade = sc.nextDouble();
		System.out.print("Q3 Grade: ");
		student.q3Grade = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		System.out.println(student.approval());
		
		sc.close();

	}

}
