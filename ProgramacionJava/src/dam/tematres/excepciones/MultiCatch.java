package dam.tematres.excepciones;
/**
 * Ejemplo de captura de excepciones no comprobadas
 * usando un multicatch
 * @author Rafa
 * @version 1.0
 */
public class MultiCatch {
	public static void main(String[] args) {		
		int num=10, den=0;
		int[] edades= {20,33,34,19};
		float res;
		try {
			//división por 0
			res = num / den;
			//acceso al elemento en posición no existente en el array
			edades[5]=edades[1]++;
			//multicatch a partir de la versión 1.8 de Java
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException)
				System.out.println("Se ha producido un error en la división, el "
						+ " denominador era 0");
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Se ha intentado acceder a un elemento del array"
						+ " cuya posición no existe");
		}
	}
}
