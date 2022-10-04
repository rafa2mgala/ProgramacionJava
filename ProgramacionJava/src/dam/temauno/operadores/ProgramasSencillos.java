package dam.temauno.operadores;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.8
 * @author Rafa
 * @version 1.0
 */
public class ProgramasSencillos {

	public static void main(String[] args) {
		//flujo de entrada estándar
		Scanner sc = new Scanner(System.in);
		//1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		int num1, num2;
		System.out.println("Introduzca un número: ");
		//utilizo nexInt para leer un número entero
		num1 = sc.nextInt();
		System.out.println("Has introducido " + num1);
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		System.out.println("Has introducido " + num2);
		
		//2. Programa Java que lea un nombre y muestre por pantalla
		String nombre;
		System.out.println("Introduzca su nombre:");
		//utilizo next() para leer una cadena desde teclado
		nombre = sc.next();
		System.out.println("Tu nombres es: " + nombre);

		//3. Escribe un programa Java que lee un número entero por teclado y 
		//obtiene y muestra por pantalla el doble y el triple de ese número.
		System.out.println("Introduzca un número: ");
		//utilizo nexInt para leer un número entero
		num1 = sc.nextInt();
		System.out.println("Doble=" + num1*2 + ", Triple=" + num1*3);
	}
}
