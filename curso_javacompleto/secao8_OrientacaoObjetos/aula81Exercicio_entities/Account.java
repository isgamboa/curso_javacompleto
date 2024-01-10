package aula81Exercicio_entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account () {
		
	}
	
	public Account(int number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount + 5; //R$5 referente à taxa de saque
	}
	
	public String toString () {
		return "Account "
			+ getNumber()
			+ ", Holder: "
			+ getHolder()
			+ ", Balance: $ "
			+ String.format("%.2f", getBalance());
	}
}
