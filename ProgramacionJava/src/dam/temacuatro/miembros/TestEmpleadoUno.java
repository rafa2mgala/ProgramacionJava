package dam.temacuatro.actividades.soluciones;
/**
 * Solución propuesta para la actividad 4.1
 * @author rafa
 * @version 1.0
 */
public class TestEmpleadoUno {
	public static void main(String[] argas) {
		//se crean 3 comerciales
		EmpleadoUno emp1 = new EmpleadoUno("Manuel",1200,Departamento.COMERCIAL,34);
		EmpleadoUno emp2 = new EmpleadoUno("Juana",1600,Departamento.COMERCIAL,44);
		EmpleadoUno emp3 = new EmpleadoUno("Loli",1000,Departamento.COMERCIAL,29);
		//se crean 2 administrativos
		EmpleadoUno emp4 = new EmpleadoUno("Antonio",1200,Departamento.ADMINISTRACION,56);
		EmpleadoUno emp5 = new EmpleadoUno("Ana",1600,Departamento.ADMINISTRACION,44);
	}
}
