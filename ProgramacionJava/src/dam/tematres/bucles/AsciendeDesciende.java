package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.16
 * Obtiene y muestra la secuencia ascendente entre 1 y el número introducido
 * seguido de la secuencia descendente desde el número introducido hasta 1
 * @author rafa
 * @version 1.0
 */
public class AsciendeDesciende {

	public static void main(String[] args) {
		String resultado="";
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número entre 5 y 20:");
		int numero = in.nextInt();
		//se comprueba si el número introducido es correcto
		if(numero<5 || numero >20)
		{
			System.out.println("El número introducido no es correcto");
			System.exit(-1);
		}
		//se compone la secuencia ascendente
		for(int i=1;i<=numero;i++)
			resultado+=i + " ";
		//se compone la secuencia descendente
		for(int i=numero-1;i>0;i--)
			resultado+=i + " ";
		
		System.out.println(resultado);
	}
}
