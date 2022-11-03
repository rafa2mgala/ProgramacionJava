package dam.temados.poo.cadenas;

import java.util.StringTokenizer;
/**
 * Solución propuesta para la actividad 2.5
 * @author rafa
 * @version 1.0
 */
public class TestAjedrez {

	public static void main(String[] args) {
		String texto1, texto2;
		final String PIEZAS = "T C A Q K A C T P P P P P P P P";
		StringTokenizer st = new StringTokenizer(PIEZAS, " ");
		texto1 = st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken()
		+ st.nextToken() + st.nextToken();
		texto2 = st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken()
		+ st.nextToken() + st.nextToken();
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.println("\n\n\n");
		System.out.println(texto2);
		System.out.println(texto1.replaceFirst("K", "Q").replaceFirst("Q", "K"));
	}

}
