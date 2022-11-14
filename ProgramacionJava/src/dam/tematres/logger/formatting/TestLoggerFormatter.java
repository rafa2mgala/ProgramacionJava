package dam.tematres.logger.formatting;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Ejemplo de formateo de mensajes de depuración utilizando dos
 * formateadores distintos, uno para la consola y otro para fichero
 * @author rafa
 * @version 1.0
 */
public class TestLoggerFormatter {

	public static void main(String[] args) {
		//manejador de tipo fichero
		FileHandler fileHandler;
		//se crea la instancia del trazador
		Logger logger = 
				Logger.getLogger(TestLoggerFormatter.class.getName());

		//se crea un formateador para los mensajes a partir de una clase
		//propia
		ConsoleFormatter consoleFormatter = new ConsoleFormatter();
		//se crea el manejador del trazador
		ConsoleHandler consoleHandler1 = new ConsoleHandler();
		//se indica el nivel mínimo del manejador
		consoleHandler1.setLevel(Level.FINE);
		//se indica cuál es el formateador, el que hemos creado previamente
		consoleHandler1.setFormatter(consoleFormatter);
		//se asocia el manejador al trazador
		logger.addHandler(consoleHandler1);
		
		//se crea el manejador del trazador de tipo fichero
		//se obtiene el símbolo separador de carpetas y se construye
		//la ruta del fichero de log
	    String pathSymbol = System.getProperty("file.separator");
	    String filePath="src/dam/tematres/logger/log.txt";
	    if(pathSymbol.equals("\\")) {
	    	filePath = "/src/dam/tematres/logger/log.txt".replaceAll("\\", 
	    			pathSymbol).substring(2);
	    }
	    
		
		try {
			//se inicializa el objeto formateador
			FileFormatter fileFormatter = new FileFormatter();
			//se inicializa el manejador de fichero, tamaño máximo por fichero
			//2000bytes, sufijo de nombrado desde 1
			fileHandler = new FileHandler(filePath,2000,1);
			//se indica el nivel mínimo del manejador
			fileHandler.setLevel(Level.FINER);
			//se indica cuál es el formateador, el que hemos creado previamente
			fileHandler.setFormatter(fileFormatter);
			//se asocia el manejador al trazador
			logger.addHandler(fileHandler);
		} catch (SecurityException | IOException e) {
			System.out.println("No ha sido posible agregar el manejador de tipo fichero," +
					" el programa continuará sin ese manejador");
		}

		//se indica, para el trazador, como nivel mínimo, cualquiera
		logger.setLevel(Level.FINER);

		//se envía al trazador un mensaje con alto nivel de detalle,
		//el texto estará precedido por tantos * como nivel tiene info
		//gracias al formateador específico
		logger.fine("Mensaje de depuración de la aplicación para detalles");

		//se envía al trazador un mensaje con alto nivel de detalle,
		//el texto estará precedido por tantos * como nivel tiene finer
		//gracias al formateador específico
		logger.finer("Mensaje de aplicación para cuestiones muy detalladas");
	}
}
