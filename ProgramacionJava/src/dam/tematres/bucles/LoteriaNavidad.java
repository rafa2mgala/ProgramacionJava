package dam.tematres.bucles;

import java.util.Random;
import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.17
 * Genera 5 números aleatorios entre el 0 y el 9 inclusives
 * @author rafa
 * @version 1.0
 */
public class LoteriaNavidad {

	public static void main(String[] args) {
		String numeroLoteria="";
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		//se generan los 5 números aleatorios
		for(int i=0;i<5;i++) {
			//genera un número aletorio entre 0 y 9 inclusives
			numeroLoteria += rnd.nextInt(10);
		}
		System.out.println(numeroLoteria);	
	}
}
