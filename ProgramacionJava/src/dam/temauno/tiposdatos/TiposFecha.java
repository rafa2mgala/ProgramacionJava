package dam.temauno.tiposdatos;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Ejemplos sobre tipos de datos en Java
 * @author Rafa
 * @version 1.0
 *
 */
public class TiposFecha {

	public static void main(String[] args) {

		Date fechaHora = new Date();
		System.out.println(fechaHora.toString());
		//Inicialización de la variable que almacena el día
		//de la semana
		int diaMes = fechaHora.getDay(); 
		System.out.println(diaMes);
		
		
		//ejemplos de tipos de datos de fecha/hora 
		//de la API 8 en adelante
		LocalDateTime ahora;
		
		//asignar valor a la variable ahora
		ahora = LocalDateTime.now();
		
		System.out.println(ahora);
		
		//extraigo sólo la hora de la fecha y hora
		//anterior
		LocalDate hoy;
		hoy = LocalDate.from(ahora);
		System.out.println(hoy);
		
		//utilizo el método of para construir una fecha a partir
		//del día, mes y año indicado
		LocalDate nombreDia = LocalDate.of(2020, 2, 27);
		System.out.println(nombreDia.getDayOfWeek().name());
	}

}
