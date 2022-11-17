package dam.temacuatro.modificadores;

/**
 * Clase para probar conceptos POO sobre el uso
 * de modificadores y 
 * @author rafa
 * @version 1.0
 */
public class TestHumano {
	public static void main(String[] args) {
		//se instancia un objeto de la clase Humano
		Humano humano = new Humano(Humano.CASTANIO, 185);
		//se puede acceder a la propiedad colorPeloDescendiente
		//porque se ha usado el modificador de acceso protected
		System.out.println(humano.colorPeloDescendiente);
	}
}
