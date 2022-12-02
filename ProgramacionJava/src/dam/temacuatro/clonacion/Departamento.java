package dam.temacuatro.clonacion;

import java.util.Arrays;
/**
 * Departamento al que pueden pertenecer varios empleados,
 * se identifica por el número del mismo
 * @author Rafa
 * @version 1.0
 */
public class Departamento {
	private int numero;
	private String nombre;
	private int numEmpleados;
	private Empleado[] empleados;
	
	{
		this.empleados = new Empleado[30];
	}
	public Departamento(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}
	public boolean addEmpleado(Empleado empleado) {
		this.empleados[this.numEmpleados] = empleado;
		this.numEmpleados++;	
		return true;
	}
	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ", numEmpleados=" + numEmpleados
				+ ", empleados=" + Arrays.toString(empleados) + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}	

}
