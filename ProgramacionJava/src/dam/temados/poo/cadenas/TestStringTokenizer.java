package dam.temados.poo.cadenas;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		//dada una frase por consola calcular
		//el número de palabras que tiene
		StringTokenizer st;
		String cadena="";
		Scanner sc = new Scanner(System.in);
		
		//pido la frase
		System.out.println("Escribe una frase:");
		//leo la frase
		cadena = sc.nextLine();
		//utilizo StringTokenizer para dividir la frase a partir
		//de los espacios en blanco que tiene
		st = new StringTokenizer(cadena);
		System.out.println(st.countTokens());
	}
}
