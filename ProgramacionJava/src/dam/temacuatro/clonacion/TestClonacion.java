package dam.temacuatro.clonacion;
/**
 * Ejemplo para probar la clonación de objetos en Java
 * @author Rafa
 * @version 1.0
 */
public class TestClonacion {	
	public static void main(String[] args) {		
		//instanciación de objetos y creación de relaciones entre 
		//un empleado y su departamento
		Empleado empleadoOriginal = new Empleado("12345678A","Adela",1200);
		Departamento departamento = new Departamento(1,"Comercial");
		empleadoOriginal.setDepartamento(departamento);
		departamento.addEmpleado(empleadoOriginal);
		
		try {
			//clonación de objetos
			Empleado empleadoClonado = (Empleado) empleadoOriginal.clone();
			System.out.println(empleadoClonado);
		} catch (CloneNotSupportedException e) {		
			e.printStackTrace();
		}
	}

}
