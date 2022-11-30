package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.4
 * Clase para mostrar los millares, centenas, decenas y unidades de un número
 * cuyo valor esté comprendido entre 1000 y 99000
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class Posicional {
	public static void main(String[] args) {
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 1000 y 99000:");

		numero = sc.nextInt();

		if(numero<1000 || numero >99000) {
			System.out.println("El número introducido es incorrecto!");
			System.exit(-1);
		}

		int unidadesMillar = numero / 1000 ;
		int centenas = (numero - (unidadesMillar * 1000 )) / 100 ;
		int decenas = (numero - (unidadesMillar * 1000 + centenas * 100 )) / 10 ;
		int unidades = (numero - (unidadesMillar * 1000 + centenas * 100 + decenas * 10 ));

		System.out.println ( "Unidades de millar = " + unidadesMillar);
		System.out.println ( "Centenas = " + centenas);
		System.out.println ( "Decenas = " + decenas);
		System.out.println ( "Unidades = " + unidades);

		sc.close();
	}
}
