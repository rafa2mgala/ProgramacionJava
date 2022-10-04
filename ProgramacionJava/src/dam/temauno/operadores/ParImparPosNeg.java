package dam.temauno.operadores;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.9
 * @author Rafa
 * @version 1.0
 */
public class ParImparPosNeg {
	public static void main(String[] args) {
		//flujo de entrada estándar
		Scanner sc = new Scanner(System.in);
		int numero; //número que se pide al usuario por consola
		String mensaje; //mensaje con el resultado
		System.out.println("Introduzca un número: ");
		//utilizo nexInt para leer un número entero
		numero = sc.nextInt();
		//calculo si el número es positivo/negativo, par/impar
		mensaje = numero>=0?numero%2==0?"Positivo y par":"Positivo e impar"
			:numero%2==0?"Negativo y par":"Negativo e impar";
		System.out.println(mensaje);
	}
}
