package dam.temacuatro.miembros;
/**
 * Empleado de la empresa, se pueden crear objetos de la clase
 * sólo con conocer el nombre del empleado
 * Solución actividad 4.2
 * @author rafa
 * @version 1.0
 */
public class EmpleadoDos {
	private String nombre;
	private int salario;
	private int departamento;
	private int edad;
	private int id;
	private static int empleados=0;
	/**
	 * Constructor predeterminado para inicializar
	 * la propiedad de identificación del empleado. El modificador
	 * de acceso es privado para evitar que se utilizado desde
	 * fuera de la clase.
	 */
	private EmpleadoDos() {
		this.id = EmpleadoDos.empleados++;
	}
	/**
	 * Constructor específico para inicializar el nombre
	 * del empleado
	 * @param nombre Nombre del empleado
	 */
	public EmpleadoDos(String nombre) {
		this();
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
	public EmpleadoDos(String nombre, int salario, 
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
	/**
	 * Devuelve el número de instancias de objetos de tipo Empleado
	 * @return Número de instancias de empleados
	 */
	public static int getEmpleados() {
		return EmpleadoDos.empleados;
	}
	/**
	 * Realiza la baja del empleado pasado como parámetro.
	 * @param empleadoDos Empleado a eliminar
	 * @return null Empleado eliminado
	 */
	public static EmpleadoDos bajaEmpleado(EmpleadoDos empleadoDos) {
		EmpleadoDos.empleados--;
		empleadoDos=null;
		return empleadoDos;
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
