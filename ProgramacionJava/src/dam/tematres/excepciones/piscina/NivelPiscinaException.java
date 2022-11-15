package dam.tematres.excepciones;
/**
 * Solución propuesta a la actividad 3.17
 * Ejemplo de excepción controlada para gestionar
 * el llenado de una piscina
 * @author rafa
 * @version 1.0
 */
public class NivelPiscinaException extends Exception {
	int nivel;
	public NivelPiscinaException (String descripcion, int valor)
	{
		super (descripcion);
		nivel=valor;
	}
}
