package dam.tematres.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Manejador de tipo fichero. Sólo establece el nivel y el nombre
 * del fichero. Con este manejador sólo se pueden enviar a fichero
 * los mensajes de trazado de nivel info hacia arriba.
 * @author rafa
 * @version 1.0
 */
public class FileHandlerLogger {
	public static void main(String[] args) {
		Logger logger = 
				Logger.getLogger(FileHandlerLogger.class.getName());

		//se declara una variable para el manejador de 
		//tipo fichero 
		FileHandler handler;

		try {
			//se instancia el manejador de registrador de 
			//tipo fichero
			handler = new FileHandler("logs.txt"); 
			//se añade el nuevo manejador al registro
			logger.addHandler(handler); 
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		//se asigna el nivel CONFIG al registrador
		logger.setLevel(Level.INFO); 
		//se envía un mensaje de trazado de nivel info
		//aparecerá en consola y en el fichero
		logger.info("Mensaje informativo");
		//se envía un mensaje de trazado de nivel config
		//no aparecerá en cosola y tampoco en el fichero
		logger.config("Set CONFIG=true");
		//se envía un mensaje de trazado de nivel warning
		//aparecerá en el fichero y en consola
		logger.log(Level.WARNING,"Error no crítico");
	}
}
