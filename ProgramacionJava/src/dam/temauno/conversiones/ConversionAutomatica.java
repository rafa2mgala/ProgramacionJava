package dam.temauno.conversiones;
/**
 * Solución propuesta para las actividades 1.6 y 1.7
 * Explica con comentarios de código
 * 
 * @author rafa
 *
 */
public class ConversionAutomatica {

	public static void main(String[] args) {
		//Actividad 1.6
		//------------------------------------------------------------------------------------
		//inicialización de una variable de tipo byte
		byte b = 42; 
		//inicialización de una variable de tipo char
		char c = 'a'; 
		//inicialización de una variable de tipo short
		short s = 1024;
		//inicialización de una variable de tipo int
		int i = 50000;
		//inicialización de una variable de tipo float
		float f = 5.67f;
		//inicialización de una variable de tipo double
		double d = .1234;
		//inicialización de una variable de tipo double, donde se producen varias conversiones 
		//automáticas de tipo:
		//(f * b) => el resultado del producto es de tipo float
		//(i / c) => el resultado del cociente es de tipo int
		//(d * s) => el resultado del producto es de tipo double
		//float + int - double => el resultado de las operaciones aritméticas es de tipo double
		double result = (f * b) + (i / c) - (d * s);
		//se muestra el valor de la variable result, pero antes se realiza una conversión 
		//automática de double a String
		System.out.println("resultado = " + result);

		//Actividad 1.7
		//------------------------------------------------------------------------------------
		//inicialización de una variable de tipo byte, se renombra la variable b por by ya 
		//que ha sido inicializada antes
		byte by = 50; 
		//En primer lugar se resuelve el producto que hay entre paréntesis, el literal numérico
		//2 se convierte automáticamente a entero. Por ello, el producto resultante es de tipo
		//entero y hay que realizar una conversión manual
        by = (byte)(by * 2); 
        //Se produce una conversión automática de byte a cadena antes de mostrar el valor
        System.out.println(by);

	}

}
