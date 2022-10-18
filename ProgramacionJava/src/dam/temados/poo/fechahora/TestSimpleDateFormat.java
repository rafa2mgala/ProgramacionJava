package dam.temados.poo.fechahora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * Ejemplo de formateo de fecha y hora usando clases de 
 * API 7 y 8
 * @author rafa
 * @version 1.0
 */
public class TestSimpleDateFormat {
	public static void main(String args[]) throws ParseException {  
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
		Date dt1 = objSDF.parse("20-08-1981");
		Date dt2 = objSDF.parse("12-10-2012");  
		System.out.println("Fecha1:" + objSDF.format(dt1)); //Fecha1: ​​20-08-1981
		System.out.println("Fecha2:" + objSDF.format(dt2)); //Fecha2: 12-10-2012
		String mensaje = dt1.compareTo(dt2) > 0?"La fecha 1 ocurre después de la fecha 2":
			dt1.compareTo(dt2) < 0?"La fecha 1 ocurre antes de la fecha 2":
				dt1.compareTo(dt2) == 0?"Ambas son las mismas fechas":
					"¡Pareces ser un viajero del tiempo!";
		System.out.println(mensaje);
		
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
		//se crea un objeto de tipo fecha y hora regionalizada
		ZonedDateTime zdt = ZonedDateTime.now();
		//se obtiene la fecha/hora formateada en una cadena
		String zdtString = FOMATTER.format(zdt);
		System.out.println(zdtString);// 07/15/2018 at 02:51 PM IST
		
		Instant timestamp1 = Instant.now();
		Instant.ofEpochMilli(timestamp1.toEpochMilli());
		//formato por defecto del instante
		System.out.println("Default time = "+timestamp1);
		//formato específico del instante, hasta milisegundos
		Instant timestamp2 = Instant.ofEpochMilli(timestamp1.toEpochMilli());
		System.out.println("Specific Time = "+timestamp2);
	}
}
