import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá mundo!");
		int idade = 25;
		double altura = 1.89;
		char sexo = 'M';
		System.out.printf("%.1f%n", altura);
		Locale.setDefault(Locale.US);

		System.out.println("A Altura é: " + altura + " metros");
		System.out.printf("A Altura é: %.1f metros.", altura);
	}

}
