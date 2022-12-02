package dam.temacuatro.clonacion;
/**
 * Ejemplo sobre clonación en Java y uso de la interfaz
 * Cloneable
 * @author Rafa
 * @version 1.0
 */
public class Empleado implements Cloneable{
	private String nif;
	private String nombre;
	private double salarioBase;
	private Departamento departamento;
	
	{		
		this.departamento = new Departamento(0,"No asignado");
	}
	public Empleado(String nif, String nombre, double salarioBase) {		
		this.nif = nif;
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", salarioBase=" + salarioBase + ", departamento="
				+ departamento + "]";
	}
	/**
	 * Este método es invocado para clonar objetos usando primero la clonación
	 * que realiza Object y después la clonación específica para objetos de esta
	 * clase
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//voy a clonar todas aquellas propiedades que sean objetos
		Empleado empleadoClonado = (Empleado) super.clone();
		empleadoClonado.nif = new String(this.nif);
		empleadoClonado.nombre = new String(this.nombre);
		empleadoClonado.departamento = new Departamento(this.departamento.getNumero(),
				this.departamento.getNombre());
		//obtengo todos los empleados que había en el departamento al que pertenece
		//el empleado actual
		Empleado[] empleados = this.departamento.getEmpleados();
		//recorro el array de empleados para añadirlos al departamento al que 
		//pertenece el empleado clonado
		for(int i=0;i<empleados.length;i++) {
			empleadoClonado.departamento.addEmpleado(empleados[i]);
		}		
		return empleadoClonado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getNif() {
		return nif;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
