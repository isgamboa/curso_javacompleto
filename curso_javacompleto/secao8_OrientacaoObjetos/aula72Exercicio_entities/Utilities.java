package aula72Exercicio_entities;

public class Utilities {
	
	public static double dollarPrice, dollarQuantity;
	
	public static double currencyConverter() {
		return (dollarPrice * dollarQuantity) * 1.06;
	}

}
