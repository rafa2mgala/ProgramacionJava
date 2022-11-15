package dam.tematres.seleccion;

import java.util.Scanner;

/**
 * Solución propuesta para la actividad 3.8
 * A partir de la estación meteorológica se indican los meses
 * correspondientes
 * @author Rafa
 * @version 1.0
 */
public class MesesEstacion {
	/**
	 * Este es el metodo principal, es el punto de entrada al programa donde el
	 * usuario inserta datos de programa
	 * 
	 * @param args Parámetros de entrada en la llamada al programa
	 */
	public static void main(String[] args) {
		// Instanciar objeto scanner para leer el numero
		Scanner lector = new Scanner(System.in);
		// Declarar el texto de estacion
		String estacion;
		// Solicitar estacion
		System.out.println("Escriba la estacion");
		// leer estacion
		estacion = lector.next();
		// Declarar switch con la estacion del usuario
		switch (estacion) {
		// En caso de que introduzca invierno pintara los meses dentro del
		// System.out.print()
		case "invierno": 
			System.out.println("Corresponde a los meses Enero,Febrero y Marzo ");
			break;
			// En caso de que introduzca primavera pintara los meses dentro del
			// System.out.print()
		case "primavera":
			System.out.println("Corresponde a los meses Abril,Mayo y Junio");
			break;
			// En caso de que introduzca verano pintara los meses dentro del
			// System.out.print()
		case "verano":
			System.out.println("Corresponde a los meses Julio,Agosto y Septiembre");
			break;
			// En caso de que introduzca otoño pintara los meses dentro del
			// System.out.print()
		case "otoño":
			System.out.println("Corresponde a los meses Octubre,Noviembre,Diciembre");
			break;
			//valor por defecto en caso de que introduzca una opcion incorrecta uso el default
		default:
			System.out.println("Introduzca una estación correcta");
			break;
		}
		// Cerrar lector
		lector.close();
		// Indicar final del programa correctamente
		System.exit(0);
	}
}