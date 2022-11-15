package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta a la actividad 3.10
 * Calcula si alguno de 5 números dados es múltiplo de 3
 * @author rafa
 * @version 1.0
 */
public class MultiploTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("A continuación se pedirán 5 números enteros positivos" +
		".\nPara cada número se calculará si es múltiplo de 3,\npulse una" +
		" tecla para empezar ...");
		sc.nextLine();
		//como se sabe la cantidad de números sobre los que hay que calcular
		//se calculará si son múltiplos usamos un for
		for(int i=0;i<5;i++) {
			System.out.println("Introduzca un número:");
			numero = sc.nextInt();
			if(numero%3==0)
				System.out.println("El número " + numero +
						" es múltiplo de 3");
			else
				System.out.println("El número " + numero +
						" NO es múltiplo de 3");
		}
		System.out.println("Hemos terminado, gracias!");
		sc.close();
	}
}
