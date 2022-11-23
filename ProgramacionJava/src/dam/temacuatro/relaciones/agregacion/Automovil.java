package dam.temacuatro.relaciones.agregacion;
/**
 * Ejemplo de relación de agregación entre las
 * clases Automovil y Navegador
 * @author Rafa
 * @version 1.0
 */
public class Automovil {
	private Navegador navegador; //Agregación
	
	public void mover() {          
		System.out.println("El coche se mueve!");
	}
	//Agregación
	public void setNavegador(Navegador navegador){
		this.navegador = navegador;
	}
}

