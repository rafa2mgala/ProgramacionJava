package dam.temados.sistema;
/**
 * Solución propuesta para la actividad 2.10
 * @author rafa
 * @version 1.0
 */
public class TestSystem {
	public static void main(String[] args) {
		//se obtienen las propiedades del sistema
		long ahora = System.nanoTime();
		System.out.println(ahora);
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.vm.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.nanoTime()-ahora);
	}
}
