package dam.temacuatro.herencia.login;

import org.eclipse.jdt.annotation.NonNull;
import dam.temacuatro.estatico.PasswordDos;
/**
 * Representa a un usuario del que interesan manejar las propiedades
 * :nombre, correo, identificador, contraseña y cuota de disco
 * @author Rafa
 * @version 1.0
 */
public class Usuario {
	//Nombre completo del usuario
	private String nombreCompleto;
	//Dirección de correo electrónico
	private String email;
	//Identificador de la cuenta
	private int id;
	//Contraseña
	private PasswordDos contrasenia;
	//Cuota de disco
	private long cuotaDisco;
	public Usuario(int id,@NonNull String contrasenia) {
		this.id = id;
		this.contrasenia = new PasswordDos(contrasenia,PasswordDos.SUBSTITUTION);
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PasswordDos getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(PasswordDos contrasenia) {
		this.contrasenia = contrasenia;
	}
	public long getCuotaDisco() {
		return cuotaDisco;
	}
	public void setCuotaDisco(long cuotaDisco) {
		this.cuotaDisco = cuotaDisco;
	}
	public int getId() {
		return id;
	}
}
