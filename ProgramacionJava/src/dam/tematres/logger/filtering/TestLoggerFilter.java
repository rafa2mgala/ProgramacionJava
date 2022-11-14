package dam.tematres.logger.filtering;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import dam.tematres.logger.formatting.ConsoleFormatter;
/**
 * Ejemplo de filtrado de mensajes de depuración utilizando una clase
 * de filtrado personalizada
 * @author rafa
 * @version 1.0
 */
public class TestLoggerFilter {

	public static void main(String[] args) {
		//se crea la instancia del trazador
		Logger logger = 
				Logger.getLogger(TestLoggerFilter.class.getName());

		//se crea un formateador para los mensajes a partir de una clase
		//propia
		ConsoleFormatter consoleFormatterFiner = new ConsoleFormatter();
		//se crea el manejador del trazador
		ConsoleHandler consoleHandler1 = new ConsoleHandler();
		//se indica el nivel mínimo del manejador
		consoleHandler1.setLevel(Level.FINER);
		//se indica cuál es el formateador, el que hemos creado previamente
		consoleHandler1.setFormatter(consoleFormatterFiner);
		//se asocia el manejador al trazador
		logger.addHandler(consoleHandler1);
		//se crea el filtrado para los mensajes de depuración
		CustomLoggLevelFilter filter = new CustomLoggLevelFilter(Level.FINER.intValue(),
				Level.CONFIG.intValue());
		//se asocia el filtrador al trazador
		logger.setFilter(filter);

		//se indica, para el trazador, como nivel mínimo, cualquiera
		logger.setLevel(Level.FINER);

		//se envía al trazador un mensaje con alto nivel de detalle,
		//el texto estará precedido por tantos * como nivel tiene info
		//gracias al formateador específico
		logger.config("Mensaje de depuración informativo");

		//se envía al trazador un mensaje con alto nivel de detalle,
		//el texto estará precedido por tantos * como nivel tiene finer
		//gracias al formateador específico
		logger.finer("Mensaje de depuración para cuestiones muy detalladas");

		//se envía al trazador un mensaje de nivel FINEST, este mensaje
		//no se mostrará porque no pasa el filtro
		logger.finest("Mensaje de depuración para un nivel de detalle máximo");
	}
}
