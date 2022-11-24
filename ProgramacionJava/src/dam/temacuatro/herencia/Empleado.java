package dam.temacuatro.herencia;

public class Empleado extends Persona {
	private float salario;
	private String nif;
	public Empleado(String nombre, String nif) {
		super.setNombre(nombre);
		this.nif = nif;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
