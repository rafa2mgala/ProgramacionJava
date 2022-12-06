package dam.temacuatro.herencia.login;

import dam.temacuatro.estatico.PasswordDos;
/**
 * Solución propuesta para la actividad 4.10. En esta clase se prueban
 * los casos de uso definidos en el enunciado de la actividad
 * @author Rafa
 * @version 1.0
 */
public class Login {

	public static void main(String[] args) throws LoginException {
		//Crear un Estudiante y un Profesor.
		Estudiante estudiante = new Estudiante(1,"","DAM22-23","1º");
		Profesor profesor = new Profesor(2,"aabbcc","Informática",1);
		//Mostrar la información de estado del estudiante y del profesor.
		System.out.println(estudiante);
		System.out.println(profesor);
		//Pedir al estudiante su contraseña y validarla con la contraseña asignada 
		//al mismo durante la creación del objeto Estudiante. Si la contraseña es 
		//correcta se indicará con un mensaje en consola, en caso contrario se lanzará 
		//la excepción LoginException y finaliza el programa. La excepción es una clase definida 
		//por nosotros y que debe extender de Exception.
		if(PasswordDos.isStrong(estudiante.getContrasenia().getPassword()))
				throw new LoginException("La contraseña introducida no cumple con los requisitos"
						+ " de fortaleza (longitud mínima 8 caracteres, al menos dos mayúsculas y"
						+ " al menos una minúscula");
		//Modificar el departamento del profesor.
		profesor.setDepartamento("Tecnología");
		//Mostrar la información de estado del profesor.
		System.out.println(profesor);
	}

}
