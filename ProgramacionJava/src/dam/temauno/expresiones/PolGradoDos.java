package dam.temauno.expresiones;
/**
 * Solución propuesta para la actividad en la que se pide
 * calcular las raíces de un polinomio de grado dos
 * @author Rafa
 * @version 1.0
 */
public class PolGradoDos {

	public static void main(String[] args) {
		double a=20,b=-4,c=8,xNegB,xPosB,dis;
		//descarto como solución que xNegB y xPosB sean 0 ambas
		//calculo b²-4ac
		dis = Math.pow(b, 2)-(4*a*c);
		//descarto radicandos negativos y denominador 0 y calculo
		//x según signo de la raíz
		xNegB = dis>-1 && a!=0?(-b-Math.sqrt(dis))/2*a:0;
		xPosB = dis>-1 && a!=0?(-b+Math.sqrt(dis))/2*a:0;
		//muestro por consola el resultado
		System.out.println((xNegB!=0 || xPosB!=0)?"Las raices del polinomio son: " + 
				xNegB + " y " + xPosB:"No ha sido posible calcular la raíz");
	}
}
