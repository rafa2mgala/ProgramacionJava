package dam.temados.poo.fechahora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Ejemplo de uso de clases de fecha-hora
 * Instant, DateTimeFormatter, ZonedDateTime, LocalDateTime, etc
 * Solución propuesta a la actividad 2.8
 * @author rafa
 * @version 1.0
 */
public class RegionTiempo {
	public static void main(String[] args) {
		//se obtiene el instante de tiempo actual en UTC
		Instant ahora = Instant.now();
		//se muestra la fecha y hora formateada según la región
		System.out.println(ZonedDateTime.now());
		//se formatea la fecha y hora regionalizada
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
		String zdtString = formatter.format(ZonedDateTime.now());
		System.out.println(zdtString);

		//se muestra la fecha y hora formateada según configuración sistema
		System.out.println(LocalDateTime.now());
		//se crea la zona de Hongkong
		ZoneId tiempoZona = ZoneId.of("Hongkong");
		//se regionaliza el tiempo a HongKong
		System.out.println("Fecha/Hora en Hongkong:" + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));
		//se crea la zona de Kiev
		tiempoZona = ZoneId.of("Europe/Kiev");
		//se regionaliza el tiempo a HongKong
		System.out.println("Fecha/Hora en Kiev " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));
		//se crea la zona de Kiev
		tiempoZona = ZoneId.of("Atlantic/Canary");
		//se regionaliza el tiempo a Canarias
		System.out.println("Fecha/Hora en Canarias " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));

		//se crea la zona de Europa
		//américa tiene 4 husos horarios, desde 0 hasta +3
		//a continuación sólo se mostrará la fecha y hora en
		//Londres
		tiempoZona = ZoneId.ofOffset("GMT",ZoneOffset.ofHours(0));
		//se regionaliza el tiempo de Londres
		System.out.println("Fecha/Hora en Londres " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));

		//se crea la zona de América
		//américa tiene 10 husos horarios, desde -2 hasta -9
		//a continuación sólo se mostrará la fecha y hora en
		//New York
		tiempoZona = ZoneId.ofOffset("GMT",ZoneOffset.ofHours(-5));
		//se regionaliza el tiempo de América
		System.out.println("Fecha/Hora en New York " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));

		//se crea la zona de Antartida
		tiempoZona = ZoneId.ofOffset("GMT",ZoneOffset.ofHours(13));
		//se regionaliza el tiempo a la Antartida
		System.out.println("Fecha/Hora en la Antartida " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));

		//se crea la zona de Oceanía
		tiempoZona = ZoneId.ofOffset("GMT",ZoneOffset.ofHours(11));
		//se regionaliza el tiempo en Oceanía
		System.out.println("Fecha/Hora en Oceanía " + 
				ZonedDateTime.ofInstant(ahora, tiempoZona));

		//igual para Asia y África, se buscan los husos horarios
		//y se asignan mediante offsets

	}
}
