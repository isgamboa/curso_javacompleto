package aula100Exercicio_entities;

import java.text.DecimalFormat;

public class Employees {
	private Integer id;
	private String name;
	private Double wage;
	
	public Employees(Integer id, String name, Double wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + new DecimalFormat("###0.00").format(wage) + "\n";
	}
	
	public void increaseWage(Double percentage) {
		
		Double newWage = (this.wage * ((percentage/100)+1));
		setWage(newWage);
		
	}
}
