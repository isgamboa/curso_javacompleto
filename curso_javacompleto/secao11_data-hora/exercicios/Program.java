package exercicios;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Program {

	public static void main(String[] args) {
		
		/*Desafio 2: Diferentes Fusos Horários
		Descrição: Crie um programa que receba a data e hora atual no fuso horário local e exiba a data e hora correspondentes em três fusos horários diferentes: UTC, Nova York e Tóquio.

		Requisitos:

		Utilize as classes ZonedDateTime e ZoneId.
		Formate a data e hora utilizando DateTimeFormatter.
		Exiba as datas e horas no formato: "Fuso horário: yyyy-MM-dd HH:mm*/
		
		
		ZonedDateTime myLocalDateTime = ZonedDateTime.now();

		System.out.println("A data e hora atual no fuso horário local é: " + myLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.systemDefault())));
		System.out.println("A data e hora atual no fuso horário UTC é: " + myLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.of("UTC"))));
		System.out.println("A data e hora atual no fuso horário de Nova York é: " + myLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.of("America/New_York"))));
		System.out.println("A data e hora atual no fuso horário de Tóquio é: " + myLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.of("Asia/Tokyo"))));


	}

}