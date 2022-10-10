package dam.temados.poo;
import java.awt.Point;
import java.util.Scanner;
/**
 * Ejemplo de comunnicación entre objetos
 * @author rafa
 *
 */
public class ComunicaObjetos {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//1. No hay ningún vehículo creado
		System.out.println("Número de vehículos=" + Automovil.numVehiculos());
		//se instancia un objeto del tipo Automovil
		Automovil autoUno = new Automovil();
		//debería mostrar 1 porque es la primera instancia de Automovil
		System.out.println(autoUno.getNumero());
		
		//2. Después de la línea anterior ya hay un vehículo creado
		System.out.println("Número de vehículos=" + Automovil.numVehiculos());
		//pedir el número de ruedas
		/*System.out.println("Introduce el nº de ruedas:");
		//leer el número de ruedas
		int ruedas = in.nextInt();
		//comunicación entre el objeto de tipo ComunicaObjetos con el objeto
		//de tipo Automovil
		autoUno.setRuedas(ruedas);*/
		
		System.out.println(autoUno.getRuedas());
		//3.Después de la siguiente línea tendremos 2 vehículos creados
		Automovil autoDos = new Automovil();
		//debería mostrar 2 porque es la segunda instancia de Automovil
		System.out.println(autoDos.getNumero());
		System.out.println("Número de vehículos=" + Automovil.numVehiculos());	
	}
	
	
	
	
	
	
	
	
}
