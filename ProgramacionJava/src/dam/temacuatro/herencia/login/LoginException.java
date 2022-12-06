package dam.temacuatro.herencia.login;
/**
 * Excepción de tipo controlada para manejar errores relacionados
 * con el login de un usuario
 * @author Rafa
 * @version 1.0
 *
 */
public class LoginException extends Exception{
	public LoginException(String message) {
		super(message);
	}
}
