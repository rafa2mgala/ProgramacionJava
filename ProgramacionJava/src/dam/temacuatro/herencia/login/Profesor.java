package dam.temacuatro.herencia.login;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Representa a un profesor del que interesan manejar propiedades como
 * el departamento y el número. El resto de propiedades son para 
 * satisfacer su relación de herencia con la clase Usuario
 * @author Rafa
 * @version 1.0
 */
public class Profesor extends Usuario{
	private String departamento;
	private int numero;
	public Profesor(int id, @NonNull String contrasenia,
			@NonNull String departamento, int numero) {
		super(id, contrasenia);
		this.departamento = departamento;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", numero=" + numero + "]";
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNumero() {
		return numero;
	}
}
