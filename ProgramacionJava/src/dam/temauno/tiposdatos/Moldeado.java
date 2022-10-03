package dam.temauno.tiposdatos;
/**
 * Clase para mostrar un ejemplo
 * sobre el uso de moldeados
 * @author Rafa
 * @version 1.0
 */
public class Moldeado {

	public static void main(String[] args) {				
		//moldeado de tipos de datos
		//, entre Empleado y Persona
		Persona persona = new Persona();
		Empleado empleado = new Empleado();
		//cualquier persona es un empleado
		//empleado = (Persona)persona;
		//cualquier empleado es una persona
		persona = (Empleado)empleado;		
				
		//uso de moldeado con envoltorios
		Number numero=null;
		Integer entero = new Integer(10);
		numero = (Number)numero;
		
		String numeroPremiado=args[0];//"83414";
		//me traigo el último carácter de la cadena
		//penúltimo carácter
		//penultimo = numeroPremiado.lenght()-1;
		//ultimo = penultimo+1;
		int penultimo=0,ultimo=0;		
		penultimo = numeroPremiado.length()>0?numeroPremiado.length()-1:0;
		ultimo = penultimo!=0?++penultimo:0;//penultimo+1
		int ultimaCifra=(penultimo>=0 && ultimo!=0)?
				Integer.valueOf(numeroPremiado.substring(penultimo,ultimo)):-1;
		
	}

}
