package dam.tematres.logger.formatting;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/**
 * Ejemplo de formateador para la consola, muestra el nivel del mensaje
 * de depuración con un número de asteriscos
 * @author rafa
 * @version 1.0
 */
public class ConsoleFormatter extends Formatter {
	@Override
	public String format(LogRecord arg0) {
		String message = "";
		String level="[";
		//a partir del nivel del registro se generan un número determinado
		//de *
		for(int i=arg0.getLevel().intValue();i<=Level.SEVERE.intValue();i+=100)
			level +="*";
		level+="] ";
			
		message = "Console Log " + level + LocalDateTime.ofInstant(Instant.ofEpochMilli(arg0.getMillis()),ZoneId.systemDefault()) +
				", " + arg0.getLevel().toString() + ", " + arg0.getMessage() ;

		return message + "\n";
	}
}
