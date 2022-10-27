package dam.tematres.bucles;

import java.io.IOException;
/**
 * Gira una línea en el sentido del reloj creada con 
 * el símbolo *. Ejemplo de bucles for anidados
 * @author rafa
 * @version 1.0
 */
public class GiraLinea {
	public static void main(String[] args) {
		int veces = 10;
		GiraLinea gl = new GiraLinea();
		while(veces>0) {
			//línea horizontal
			for(int i=0;i<5;i++) {
				if(i<5/2) System.out.println();
				else if(i==5/2)
					for(int j=0;j<5;j++) {
						System.out.print("* ");
					}
				else
					System.out.println();

			}
			gl.esperarUnSegundo();	
			//diagonal izquierda
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(i==j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
			gl.esperarUnSegundo();

			//línea vertical
			for(int i=0;i<5;i++) {			
				for(int j=0;j<5/2+1;j++) {
					if(j==(5/2))
						System.out.println("*");
					else
						System.out.print(" ");
				}
			}
			gl.esperarUnSegundo();
			//diagonal derecha
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(j==5-(i+1))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			gl.esperarUnSegundo();
			//decremento la variable de control del bucle while
			//para garantizar que el bucle termina
			veces--;
		}
	}
	private void esperarUnSegundo() {
		long instante,millis=0;
		//esperamos un segundo
		instante = System.currentTimeMillis();
		while(millis<1000)
			millis = System.currentTimeMillis()-instante;
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {			
			e.printStackTrace();
		}  
	}
}
