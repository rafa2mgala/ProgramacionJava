package dam.temauno.expresiones;
/**
 * Solución propuesta a la actividad 1.11. Variables y constantes.
 * @author Rafa
 * @version 1.0
 */
public class ActUnoOnce {
	public static void main(String[] args) {	
		final double H_PLANCK = 6.62607015E-34;
		final double G_UNIVERSAL=6.67E-11;
		final double MASA_TIERRA = 5.972E24;
		final int ROJO=0;
		final int VERDE=1;
		final int AMARILLO=2;
		final int ARRIBA=100;
		final int ABAJO=101;
		final int IZQUIERDA=102;
		final int DERECHA=103;
		final int CTRL=104;
		final int C=105;
		final int V=106;
		final int X=107;
		int estadoSemaforo,teclasPulsadas;
		double energia,frecuencia=0,radio=1,masa=0,fuerzaGravitacion;		
		//E=h*v (h es la constante de Planck , busca su valor en Internet)
		energia = H_PLANCK*frecuencia;
		//F=-G*M*m/r² (G es la constante de gravitación universal, busca su valor en Internet)
		fuerzaGravitacion = -G_UNIVERSAL*MASA_TIERRA*masa/radio;
		//Los colores de un semáforo son: rojo, verde y amarillo. 
		//El estado de un semáforo siempre presentará uno de esos colores. Ahora está en rojo.
		estadoSemaforo = ROJO;		
		//En un teclado de ordenador hay 4 teclas de dirección: arriba, derecha, izquierda y abajo. 
		//Cada tecla es única y está representada por un valor que no cambia.
		teclasPulsadas = ARRIBA;
		//En un teclado de ordenador hay teclas especiales (atajos) que sirven para realizar 
		//operaciones específicas. Por ejemplo: ctrl+c para copiar, ctrl+x para cortar y ctrl+v para pegar. 
		//Las combinaciones tienen asociado un valor único que no cambia.
		teclasPulsadas = CTRL + C;
	}
}
