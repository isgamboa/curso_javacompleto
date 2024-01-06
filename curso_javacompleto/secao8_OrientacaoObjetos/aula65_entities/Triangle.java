package aula65_entities;

public class Triangle {
	
	//Entidade responsável por armazenar os dados referentes às medidas dos lados dos triângulos.
	
	public double a;
	public double b;
	public double c;

	public double area() {
	//Método responsável por calcular a área do triângulo.
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
