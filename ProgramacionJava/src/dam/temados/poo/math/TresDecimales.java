package dam.temados.poo.math;

import java.util.Scanner;
/**
 * Solución propuesta a la actividad 2.6
 * @author Rafa
 * @version 1.0
 */
public class TresDecimales {

	public static void main(String[] args) {
		double numUno, numDos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número decimal:");
		numUno = sc.nextDouble();
		System.out.println("Introduce otro número decimal:");
		numDos = sc.nextDouble();
		
		System.out.println(numUno>numDos?"El número " + numUno +
				" es mayor que " + numDos:numDos>numUno?"El número " +
				numDos + " es mayor que " + numUno:"Los dos números " +
				" introducidos son iguales");
		
		System.out.println("El entero menor o igual y más próximo a " + 
				numUno + " es " + Math.floor(numUno));
		
		System.out.println("El entero mayor o igual y más próximo a " + 
				numUno + " es " + Math.ceil(numUno));
		
		System.out.println("El número " + numUno +
				" redondeado es: " + Math.round(numUno) + 
				" y el número " + numDos + " redondeado es: " +
				Math.round(numDos) + ". El producto entre ambos es " +
				Math.round(numUno) * Math.round(numDos));
	}

}
