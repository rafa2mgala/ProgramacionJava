package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.13
 * Clase para adivinar un número introducido previamente en tres intentos
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class Adivino {
	public static void main(String[] args) {
		int numAdivinar, numIntento;
		boolean adivinado=false;
		int intento = 0; 
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número a adivinar: ");
		numAdivinar = sc.nextInt(); 

		while (intento < 3 && !adivinado) {	
			System.out.println("Intento " + ++intento + ", introduzca un número: ");
			numIntento = sc.nextInt();

			if(numIntento < numAdivinar) 
				System.out.println("El número a adivinar es mayor.");

			else if(numIntento > numAdivinar)
				System.out.println("El número a adivinar es menor.");

			adivinado = (numIntento == numAdivinar);
		}
		if(!adivinado)
			System.out.println("¡Ha llegado al límite de los intentos y no lo has adivinado!");
		else
			System.out.println("¡Enhorabuena lo has adivinado!, el número era el " + numAdivinar);
		sc.close();
	}
}