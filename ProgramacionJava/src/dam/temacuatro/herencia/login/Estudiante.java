package dam.temacuatro.herencia.login;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Representa a un estudiante del que interesan manejar propiedades como
 * la matrícula, el aula y el curso. Sólo es posible modificar el aula
 * del estudiante. El resto de propiedades son para  satisfacer su relación 
 * de herencia con la clase Usuario
 * @author Rafa
 * @version 1.0
 */
public class Estudiante extends Usuario{
	private String numMatricula;
	private String aula;
	private String curso;

	public Estudiante(int id, @NonNull String contrasenia,
			@NonNull String numMatricula, @NonNull String curso) {
		super(id,contrasenia);
		this.numMatricula = numMatricula;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante [numMatricula=" + numMatricula + ", aula=" + aula + ", curso=" + curso + "]";
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public String getCurso() {
		return curso;
	}
}
