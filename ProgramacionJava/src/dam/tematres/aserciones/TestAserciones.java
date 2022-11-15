package dam.tematres.aserciones;

import java.util.Scanner;
/**
 * Prueba de aserciones para evitar las excepciones: ArithmeticException,
 * NullPointerException y IndexOutOfBoundException (o sus derivadas)
 * @author rafa
 * @version 1.0
 */
public class TestAserciones {
	public static void main(String[] args) {
		String texto=null;
		int pos=0;
		Scanner entradaTexto = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		TestAserciones tas = new TestAserciones();
		System.out.println("¿Quieres introducir un texto? (s/n)");
		texto = entradaTexto.nextLine();
		if(!texto.toUpperCase().equals("N")) {
			System.out.println("Introduce un texto: ");
			texto = entradaTexto.nextLine();
		}
		System.out.println("Introduce una posición en la cadena: ");
		pos = entradaNumero.nextInt();
		tas.test(pos, texto);
	}
	/**
	 * Muestra el carácter del texto indicado como parámetro en la posición indicada
	 * @param pos Entero con la posición del carácter a mostrar
	 * @param texto Cadena de caracteres de la que se mostrará el carácter
	 */
	private void test(int pos, String texto) {						
		//NullPointerException		
		assert(texto!=null):"No has introducido un texto";
		//IndexOutOfBoundException
		assert(pos>-1 && pos<texto.length()):
			"No es posible obtener el carácter de la cadena de la posición indicada";
		System.out.println(texto.charAt(pos));
		//ArithmeticException
		assert(pos>0):
			"La posición indicada no se puede usar para dividir la cadena";
		System.out.print("Se ha dividido la cadena en " +
				(int)(texto.length()/pos) + " partes.");
	}
}
