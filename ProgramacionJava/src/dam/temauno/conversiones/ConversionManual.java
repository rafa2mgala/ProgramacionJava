package dam.temauno.conversiones;
/**
 * Actividad 1.4
 * 1. Realiza una conversión de tipos de datos, utilizando 3 variables,
 * para el tipo entero, entero largo y decimal con simple precisión. Asigna un valor a la
 * variable entero largo, después asigna dicha variable a la variable de tipo entero y
 * finalmente asigna la variable de tipo entero largo a la variable de tipo decimal.
 * 
 * @author rafa
 * @version 1.0
 */
public class ConversionManual {
	public static void main(String[] args) {
		//Primer apartado
		int entero;
		long enteroLargo;
		float decimal;
		
		enteroLargo = 1000;
		//conversión explícita, el tipo destino tiene menor capacidad de representación
		entero = (int) enteroLargo;
		decimal = enteroLargo;
		
		System.out.println("enteroLargo=" + enteroLargo + ",entero=" + entero +",decimal="+decimal);
		
		//Segundo apartado
		//El código ni siquiera se podría ejecutar ya que daría fallo de compilación debido a que
		//es necesario el casting explícito de int a char
		char ch = 'c';

		int num = 88;
		//conversión explícita, el tipo destino tiene menor capacidad de representación
		ch = (char)num;	
	}
}
