package dam.tematres.excepciones;
/**
 * Solución propuesta a la actividad 3.17
 * Ejemplo de excepción controlada para gestionar
 * el llenado de una piscina
 * @author rafa
 * @version 1.0
 */
public class Piscina {
	private int nivel;
	public final int MAX_NIVEL;

	public Piscina(int max)
	{
		if (max<0) max=0;
		MAX_NIVEL=max;
	}
	public int getNivel()
	{ return nivel; }
	public void vaciar(int cantidad) throws NivelPiscinaException
	{
		if (nivel-cantidad < 0)
			throw new NivelPiscinaException("Vaciado excesivo", nivel-cantidad);
		else nivel=nivel-cantidad;
	}
	public void llenar(int cantidad) throws NivelPiscinaException
	{
		if (nivel+cantidad > MAX_NIVEL)
			throw new NivelPiscinaException("Llenado excesivo", nivel+cantidad);
		else nivel=nivel+cantidad;
	}

}
