package dam.tematres.bucles;

import java.util.Scanner;

/**
 * Solución propuesta para la actividad 3.11
 * @author rafa
 * @version 1.0
 */
public class EnteroAHexadecimal {
	public static void main(String[] args) {
		int numero=0,cociente=0;
		final String HEXADECIMAL="0123456789ABCDEF";
		StringBuffer hex = new StringBuffer();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca un número comprendido entre 0 y 256:");
		numero = in.nextInt();
		if(numero >256 || numero <0) {
			System.out.println("El número no es correcto");
			System.exit(-1);
		}
		cociente = numero;
		do {
			hex.append(HEXADECIMAL.charAt(cociente%16));
		}while((cociente /= 16)>=16);
		hex.append(HEXADECIMAL.charAt(cociente));
		System.out.println(hex.reverse());
		in.close();
	}
}
