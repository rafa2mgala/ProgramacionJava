package dam.temauno.operadores;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.10
 * @author Rafa
 * @version 1.0
 */
public class LetraMayuscula {
	public static void main(String[] args) {
		//inicializo el flujo de entrada estándar
		Scanner sc = new Scanner(System.in);
		String letra;
		System.out.println("Introduzca una letra:");
		//recojo la letra desde la entrada estándar
		letra = sc.next();
		//comprueba si la letra introducida es mayúscula
		//y muestro el resultado
		System.out.println(letra.toUpperCase()==letra?"La letra introducida" +
				" es mayúscula":"La letra introducida es minúscula");
	}
}
