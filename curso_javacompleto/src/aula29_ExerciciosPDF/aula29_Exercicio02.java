package aula29_ExerciciosPDF;
import java.util.Scanner;
import java.util.Locale;

public class aula29_Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio, area, pi;
		
		pi = 3.14159;
		System.out.println("Por favor, informe o raio do círculo e digite enter:");
		raio = sc.nextFloat();
		
		area = (Math.pow(raio,2)) * pi;
		System.out.printf("A área do círculo é igual a %.4f%n", area);
				
		sc.close();
		
	}
}