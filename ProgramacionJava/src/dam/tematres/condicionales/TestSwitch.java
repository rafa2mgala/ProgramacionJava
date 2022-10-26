package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Ejemplo de uso de la estructura condicional switch
 * @author Rafa
 * @version 1.0
 */
public class TestSwitch {
	public static final int VERANO=0;
	public static final int OTONIO=1;
	public static final int INVIERNO=2;
	public static final int PRIMAVERA=3;
	private int estacion;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una estación del año (VERANO=0,OTOÑO=1"
				+ ",INVIERNO=2,PRIMAVERA=3):");

		TestSwitch ts = new TestSwitch();
		ts.estacion = sc.nextInt();			
		switch(ts.estacion)
		{
		case INVIERNO:
			System.out.println("Diciembre, Enero y Febrero");
			break;
		case VERANO:
			System.out.println("Junio, Julio y Agosto");
			break;
		case OTONIO:
			System.out.println("Septiembre, Octubre y Noviembre");
			break;
		case PRIMAVERA:
			System.out.println("Marzo, Abril y Mayo");
			break;
		default:
			System.out.println("Estación incorrecta");
			break;
		}
		sc.close();
	}
	/**
	 * Calcula los meses de la estación indicada como parámetro
	 * @param estacion Estación del año indicada por alguna de las constantes
	 * definidas para ello
	 * @return Cadena de caracteres con los nombres de los meses
	 * de la estación indicada
	 */
	public static String getMonthsSeason(int estacion) {
		switch(estacion) {
		case INVIERNO -> {return "Diciembre, Enero y Febrero";}
		case VERANO -> {return "Junio, Julio y Agosto";}
		case OTONIO ->{return "Septiembre, Octubre y Noviembre";}
		case PRIMAVERA ->{return "Marzo, Abril y Mayo";}
		default->{return "Estación incorrecta";}
		}
	}
}