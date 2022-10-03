package dam.temauno.tiposdatos;
/**
 * Clase para mostrar diferencias entre envoltorios y
 * tipos de datos simples
 * @author Rafa
 * @version 1.0
 */
public class Envoltorio {
	public static void main(String[] args) {		
		int edad=20;
		//inicialización de la variable numero
		//usando un envoltorio sin conversión implícita
		Integer numero= new Integer(20);
		//se usa un envoltorio de tipo entero al que 
		//se le asigna un valor desde una cadena
		//de caracteres
		System.out.println(numero.parseInt("34"));		
	}
}
