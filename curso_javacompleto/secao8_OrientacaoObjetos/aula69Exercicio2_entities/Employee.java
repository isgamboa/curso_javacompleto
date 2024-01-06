package aula69Exercicio2_entities;

public class Employee {

	public String name;
	public Double grossSalary, tax;
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary (Double percentage) {
		grossSalary = (grossSalary * ((percentage / 100) + 1));
		
	}
	
	public String toString () {
		return name +
				" , $ " +
				String.format("%.2f", netSalary());
	}
}
