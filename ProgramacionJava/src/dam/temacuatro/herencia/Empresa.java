package dam.temacuatro.herencia;

public class Empresa {
	private Empleado empleados[];
	private int siguienteEmpleado;
	{
		this.empleados = new Empleado[100];
		this.siguienteEmpleado = 0;
	}
	public static void main(String[] args) {
			
	}
	public Empresa(Empleado empleado) {
		this.empleados[0] = empleado;
		this.siguienteEmpleado++;
	}
	public int addEmpleado(Empleado empleado) {
		this.empleados[this.siguienteEmpleado] = empleado;
		return ++this.siguienteEmpleado;
	}
	public boolean delEmpleado(String nif) {
		
	}	
}
