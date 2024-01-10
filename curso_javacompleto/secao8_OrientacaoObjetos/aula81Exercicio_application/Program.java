package aula81Exercicio_application;

import java.util.Locale;
import java.util.Scanner;

import aula81Exercicio_entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Account account;
		Double initialDeposit, amount;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String optInitialDeposit = sc.nextLine();
		if (optInitialDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new Account (number, holder, initialDeposit);
		}
		else {
			account = new Account (number, holder);		
		}
		System.out.println();
		System.out.println("Account data:\n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println();
		System.out.println("Updated account data:\n" + account);		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data:\n" + account);	
		
		sc.close();
	}
}
