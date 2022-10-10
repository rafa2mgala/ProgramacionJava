package dam.temados.poo;

/**
 * Clase para probar vehículos
 * @author Rafa
 * @version 1.0
 */
public class TestVehiculo {
	public static void main(String[] args) {
		//se crea un objeto de tipo Automovil
		Automovil auto = new Automovil();
		//se modifica el número de ruedas del automóvil
		auto.setRuedas(-5);
		//se obtiene el número de ruedas del automóvil
		System.out.println(auto.getRuedas()); 
		
		//se crea un objeto de tipo Motocicleta
		Motocicleta moto = new Motocicleta();
		//se asigna el número de rueda de la moto
		moto.setRuedas(2);
		//la moto acelera
		moto.acelera();
		//se muestra la velocidad actual de la moto después de acelerar
		System.out.println(moto.getVelocidad());
	}
}
