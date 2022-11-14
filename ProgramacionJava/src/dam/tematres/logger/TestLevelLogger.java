package dam.tematres.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejemplo de ajuste del nivel de trazado en manejador y trazador
 * @author rafa
 * @version 1.0
 */
public class TestLevelLogger {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestLevelLogger.class.getName());
		//creo una instancia de manejador de consola
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINER);
		
		logger.addHandler(consoleHandler);
		//se establece el nivel del logger, prevalece el nivel de trazado
		//del logger sobre los niveles de trazado de los manejadores
		//El nivel del trazador debe ser menor o igual que el nivel más
		//bajo de los manejadores.
		logger.setLevel(Level.FINER);

		//registro un mensaje con nivel inferior a config
		logger.finer("Prueba de mensaje con nivel inferior a config");

		//registro un mensaje con nivel igual a config
		logger.config("Prueba de mensaje con nivel igual a config");

		//registro otro mensaje de un nivel superior al config
		logger.warning("Prueba de mensaje con nivel superior a config");
	}
}
