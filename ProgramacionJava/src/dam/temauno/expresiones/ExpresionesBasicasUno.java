package dam.temauno.expresiones;
/**
 * Solución propuesta a la actividad 4 de la sección de refuerzo y ampliación
 * @author Rafa
 * @version 1.0
 */
public class ExpresionesBasicasUno {

	public static void main(String[] args) {
		//1.El doble de un número N
		int resultado = 1;
		resultado *=2; //o bien resultado = resultado * 2;
		//2.El triple de un número N
		resultado *=3; //o bien numero = numero * 3;
		//3.Seis veces la diferencia de dos números enteros A y B
		int a=10, b=2, c=8, d=11;
		resultado = 6*(a-b); //o bien 6*(b-a),o bien (b-a)*6 o (a-b)*6
		//4.La diferencia entre el producto de A por B y la suma de C más D
		resultado = (a*b)-(c+d);
		//5.La mitad de la última cifra de un número entero A
		float mitad=0;
		int cifrasResultado = String.valueOf(resultado).length();
		String ultimaCifra = String.valueOf(resultado).substring(cifrasResultado-1,cifrasResultado);
		mitad = Float.valueOf(ultimaCifra)/2;
		//6. La suma de los dígitos de un número entero N de 3 cifras
		int n=234, centenas, decenas, unidades;
		centenas = (int)n/100;
		decenas = (n-centenas*100)/10;
		unidades = n - (centenas*100) - (decenas*10);
		resultado = centenas + decenas + unidades;
		//7. La suma de la última cifra de los números enteros N y M
		int m=22;
		int ultimaCifraN, ultimaCifraM;
		int cifrasN, cifrasM;
		cifrasN = String.valueOf(n).length();
		cifrasM = String.valueOf(m).length();
		
		ultimaCifraN = Integer.valueOf(String.valueOf(n).substring(cifrasN-1,cifrasN));
		ultimaCifraM = Integer.valueOf(String.valueOf(m).substring(cifrasM-1,cifrasM));
		
		resultado = ultimaCifraN+ ultimaCifraM;
		//8.Comprobar si un número entero N es múltiplo de 2 y de 3
		boolean multiploDosTres = n%2==0 && n%3==0;
	}

}
