package dam.temauno.conversiones;

/**
 * Esta clase tiene como finalidad presentar
 * distintos ejemplos de <b>conversiones de tipos</b>
 * @author Rafa
 * @version 1.0
 */
public class ConversionTipos {
	public static void main(String[] args) {		
		long n = 12345678914L;
		float f = n; //conversión automática de tipos, de int a float
		System.out.println(f);

		long l = 10L; //conversión automática usando espcificador de tipo
		int entero = 10;
		l = entero * 2; //conversión automática sin usar especificador de tipo
		entero = (int)l;//conversión explícita o manual, es posible la pérdida de 
						//precisión y el desbordamiento
		
		//uso de getClass en objetos para obtener el nombre del tipo del objeto
		String cadena="Hola";
		String nombreTipo = cadena.getClass().getName();
		System.out.println(nombreTipo);
		
		//comprobar si cadena es de tipo String
		System.out.println(cadena instanceof String);

	}
}
