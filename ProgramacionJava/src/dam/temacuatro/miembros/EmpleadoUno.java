package dam.temacuatro.actividades.soluciones;
/**
 * Empleado de la empresa, se pueden crear objetos de la clase
 * sólo con conocer el nombre del empleado
 * @author rafa
 * @version 1.0
 */
public class EmpleadoUno {
	private String nombre;
	private int salario;
	private int departamento;
	private int edad;
	/**
	 * Constructor específico para inicializar el nombre
	 * del empleado
	 * @param nombre Nombre del empleado
	 */
	public EmpleadoUno(String nombre) {
		this.nombre = nombre;
	}
	/** 
	 * Constructor específico para inicializar un objeto de tipo empleado
	 * con todas sus propiedades 
	 * @param nombre Nombre del empleado
	 * @param salario Salario del empleado
	 * @param departamento Departamento del empleado
	 * @param edad Edad del empleado
	 */
	public EmpleadoUno(String nombre, int salario, 
			int departamento, int edad) {
		this(nombre);
		this.salario = salario;
		this.departamento = departamento;
		this.edad = edad;
	}
	/**
	 * Incrementa el salario en el porcentaje indicado
	 * @param porcentaje Porcentaje a incrementar
	 */
	public void incrementaSalario(int porcentaje) {
		this.salario += this.salario*(this.salario*100/porcentaje);
	}
	@Override
	public String toString() {
		return "EmpleadoUno [nombre=" + nombre + ", salario=" + salario + ", departamento=" + departamento + ", edad="
				+ edad + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}	
}
