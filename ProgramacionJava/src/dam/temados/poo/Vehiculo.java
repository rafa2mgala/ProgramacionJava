package dam.temados.poo;
/**
 * Clase base para Automovil y Motocicleta, relación jerárquica
 * @author Rafa
 * @version 1.0
 */
public class Vehiculo {
	//propiedad para almacenar la potencia de los objetos de tipo automóvil
	protected int potencia;
	protected int ruedas;
	protected String marca;
	protected int color;
	protected boolean elctrico;
	protected boolean automatico;
	protected double velocidad;
	private int incremento=12;
	private int numero;
	//almacenar el número de objetos de tipo Vehículo que se han creado
	private static int numVehiculo=0;
	/**
	 * Constructor de vehículos predeterminado
	 */
	public Vehiculo() {
		this.numero=++Vehiculo.numVehiculo;
	}
	/*
	 * primer comportamiento del automóvil
	 */
	public void acelera() {
		//variable local, no es una propiedad
		int incremento=10;
		this.velocidad+=this.incremento;	
	}
	/*
	 * segundo comportamiento del automóvil
	 */
	public void frena() {
		this.velocidad-=10;
	}	
	/**
	 * Se utiliza para modificar el número de ruedas del automóvil
	 * @param ruedas Entero que contiene el número de ruedas que se asignarán al automóvil
	 */
	public void setRuedas(int ruedas) {		
		this.ruedas = ruedas<0?0:ruedas;
	}
	/**
	 * Se utiliza para obtener el número de ruedas de un automóvil
	 * @return Entero con el número de ruedas del automóvil
	 */
	public int getRuedas() {
		return this.ruedas;
	}
	/**
	 * Devuelve la velocidad actual (double)
	 * @return double que representa la velocidad actual del vehículo
	 */
	public double getVelocidad() {
		return velocidad;
	}
	/**
	 * Obtiene el número de vehículos creados
	 * @return int Con el número de vehículos creados
	 */
	public static int numVehiculos() {
		return Vehiculo.numVehiculo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	
	
	
}
