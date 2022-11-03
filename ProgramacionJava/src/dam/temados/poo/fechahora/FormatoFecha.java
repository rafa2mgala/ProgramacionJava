package dam.temados.poo.fechahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
/**
 * Ejemplo de uso de clases relacionadas con el formato
 * de fecha y hora. Solución propuesta a la actividad 2.7
 * 
 * @author rafa
 * @version 1.0
 */
public class FormatoFecha {
	public static void main(String[] args) {
		String fecha="";
		Scanner in=new Scanner(System.in);

		LocalDate today = LocalDate.now();
		System.out.println("La fecha del primer día del mes= "+
		today.with(TemporalAdjusters.firstDayOfMonth()));


		System.out.println("Introduce una fecha de la siguiente manera: "
				+ "dd/MM/aaaa hh:mm:ss");
		//se lee la fecha y hora introducida y se guarda en la variable fecha
		//la fecha y hora se debe introducir de la forma dd/MM/aaaa hh:mm:ss
		//se lee la línea completa incluidos los espacios
		fecha=in.nextLine();

		//se pasa la cadena a un objeto de tipo LocalDateTime
		//se construye el objeto LocalDateTime con su formato original de entrada
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");
		LocalDateTime fechaHora = LocalDateTime.parse(fecha, formato);
		//se aplica el formato NombreDía, Mes Día Año hh:mm:ss
		formato = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		System.out.println( fechaHora.format(formato));
		//se aplica el formato NombreDía, Mes Día Año
		formato = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		System.out.println( fechaHora.format(formato));
		//se aplica el formato Mes Día, Año
		formato = DateTimeFormatter.ofPattern("MM dd, yyyy");
		System.out.println( fechaHora.format(formato));
	}

}
