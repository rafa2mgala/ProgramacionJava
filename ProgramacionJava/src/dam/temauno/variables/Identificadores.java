package dam.temauno.variables;
/**
 * Identificadores de variables
 * @author rafa
 * @version 1.0
 *
 */
public class Identificadores {

	public static void main(String[] args) {
		String apellido2; //correcto
		String APELLIDO DOS; //incorrecto, tiene espacio
		String 2Apellido; //incorrecto, empieza por número
		String APELLIDO_; //correcto
		String APELLIDO*; //incorrecto, * operador Java
		String 222; //incorrecto, todo números
		String _222; //correcto
		String *222; //incorrecto *
		String ENTERO; //correcto
		String entero; //correcto
		String entero_2;//correcto
		String "nombre"; //incorrecto, literal de tipo cadena
		String verdadero; //correcto
		String __falso;//correcto
		String 2.2; //incorrecto, empieza por número
		String CiUdAd; //correcto
		String país; //correcto
		String PI.PI; //incorrecto, tiene punto
		String PI*PI; //incorrecto, tiene operador *
		String PI_PI; //correcto
		String ¿QUIEN?; //incorrecto, empieza por ?
		String _???; //incorrecto, caracteres ? no permitidos
		String NO; //correcto
		String SÍ; //correcto
		String z; //correcto
		String e; //correcto
		String _; //incorrecto
	}
}
