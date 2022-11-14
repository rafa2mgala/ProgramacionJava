package dam.tematres.logger.filtering;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/**
 * Ejemplo de filtrado por nivel, recibe un nivel mínimo
 * y máximo para el filtrado de mensajes de depuración
 * @author rafa
 * @version 1.0
 */
public class CustomLoggLevelFilter implements Filter {
	private int minLevel,maxLevel;
	public CustomLoggLevelFilter(int minLevel, int maxLevel) throws IllegalArgumentException {
		//se controla los posibles valores recibidos para el filtrado por nivel
		if(minLevel<Level.FINEST.intValue() ||
				maxLevel>Level.SEVERE.intValue())
			throw new IllegalArgumentException("Los niveles indicados para el filtrado" + 
					" de mensajes de depuración son incorrectos, los niveles deben estar" +
					" comprendidos entre Level.FINEST y Level.SEVERE");
			
		this.minLevel=minLevel;
		this.maxLevel=maxLevel;
	}
	
	@Override
	public boolean isLoggable(LogRecord log) {
		//sólo se permite trazar los mensajes cuyo nivel este comprendido
		//entre FINE y CONFIG, el resto se descartan
		if(log.getLevel().intValue()<this.minLevel || 
				log.getLevel().intValue()>this.maxLevel)return false;
		
		return true;
	}
}
