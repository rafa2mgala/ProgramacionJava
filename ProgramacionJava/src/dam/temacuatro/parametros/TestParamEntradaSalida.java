package dam.temacuatro.parametros;
/**
 * Ejemplo de parámetros de entrada-salida
 * @author Rafa
 * @version 1.0
 */
public class TestParamEntradaSalida {
	public static void main(String[] args) {
		TestParamEntradaSalida test = 
				new TestParamEntradaSalida();
		int sum1 = 10;
		int sum2 = 20;

		Resultado suma= new Resultado();
		//sum1, sum2 y suma son parámetros actuales
		//suma se pasa por referencia
		test.sumar(sum1, sum2, suma);		
		System.out.println(suma);
		//sum1 y suma son parámetros actuales,
		//suma se pasa por referencia
		test.sumar(sum1, suma);		
		System.out.println(suma);
	}
	/**
	 * Calcula la suma de dos números enteros y pone el resultado
	 * en el tercer parámetro. Este último parámetro
	 * actúa como parámetro de salida
	 * @param sum1 Parámetro de entrada, se pasa por valor
	 * @param sum2 Parámetro de entrada, se pasa por valor
	 * @param suma Parámetro de salida, se pasa por referencia
	 * Es un parámetro sólo de salida porque no se usa su valor
	 * dentro del método.
	 */
	public void sumar(int sum1, int sum2, Resultado suma) {		
		suma.setResultado(sum1+sum2);				
	}
	/**
	 * Calcula la suma un numéro entero al resultado
	 * de la suma y pone el resultado
	 * en el tercer parámetro. Este último parámetro
	 * actúa como parámetro de entrada y salida
	 * @param sum1 Parámetro de entrada, se pasa por valor
	 * @param sum2 Parámetro de entrada, se pasa por valor
	 * @param suma Parámetro de salida, se pasa por referencia
	 * Es un parámetro es de entrada y salida porque 
	 * se usa su valor dentro del método.
	 */
	public void sumar(int sum, Resultado suma) {
		suma.setResultado(suma.getResultado()+sum);
	}
}
