package dam.temauno.tiposdatos;

/**
 * Solución propuesta a la actividad 1.15
 * Programa para ver algunos de los metodos que ofrece la clase String
 * @author Iordache Mihai Laurentiu
 * @version 1.0
 */
public class ClaseString {
    public static void main(String[] args){
        String cadena = "Spring es un framework para Java EE";
        String cadena1 = "SPRING ES UN FRAMEWORK PARA JAVA EE";

        /* charAt devuelve el caracter que se encuentra en la posición o índice
        * especificado como argumento. */
        System.out.println("Caracter en posicin 3 comenzando por 0 = " + cadena.charAt(3));
        System.out.println("----------------------------------");

        /* La versión no case-sensitive de equals compara la cadena
        * con  la cadena pasada como argumento. Devuelve true o false*/
        System.out.println("Son iguales? = " + cadena.equals(cadena1));
        System.out.println("----------------------------------");

        /* La versión case sensitive no tiene en cuenta mayúsculas o minúsculas.
        * En el resto es igual que el anterior método.*/
        System.out.println("Son iguales? = " + cadena.equalsIgnoreCase(cadena1));
        System.out.println("----------------------------------");

        /* El método startsWith indica si una cadena empieza con un determinado prefijo
        * La versión sobrecargada permite indicar un índice desde dónde empezar a buscar.
        * Devuelve true o false*/
        System.out.println("Empieza con Spring? = " + cadena.startsWith("Spring"));
        System.out.println("Empieza con framework a partir del indice 13? = " +
                cadena.startsWith("framework", 13));
        System.out.println("----------------------------------");

        /* El método endsWith funciona similar a startsWith solo que dice si la cadena
        * termina en cuestión con el sufijo que indiquemos. No está sobrecargado.*/
        System.out.println("Termina con Java EE? = " + cadena.endsWith("Java EE"));

        /* indexOf es un método sobrecargado. Es decir, tiene distintas variantes
        * y en base a los parámetros recibidos, se ejecuta uno u otro. Lo que hace
        * en cuestión es devolver la posición (en entero) del caracter o cadena
        * que se pase como argumento.*/
        System.out.println("----------------------------------");

        // indexOf pasando un caracter como argumento
        System.out.println("Posición de la primera g encontrada = " + cadena.indexOf('g'));
        System.out.println("----------------------------------");

        // indexOf pasando un caracter como argumento y un índice como segundo
        System.out.println("Posición de la primera a comenzando por el indice 16 = " +
                cadena.indexOf('a', 16));
        System.out.println("----------------------------------");

        // indexOf pasando una cadena como argumento
        System.out.println("Posición a partir de la cual empieza la cadena: " +
                cadena.indexOf("framework"));
        System.out.println("----------------------------------");

        // indexOf pasando una cadena como primer argumento y un indice como segundo
        System.out.println("Posición donde empieza la cadena a partir del indice: " +
                cadena.indexOf("para", 13));

        /* lastIndexOf es similar a indexOf solo que devuelve la última ocurrencia
        * del caracter o cadena que se pase como argumento. También está sobrecargado.*/
        System.out.println("----------------------------------");

        // lastIndexOf pasando un caracter como argumento
        System.out.println("Posición de la última ocurrencia del caracter a dentro de la cadena = " +
                cadena.lastIndexOf('a'));
        System.out.println("----------------------------------");

        // lastIndexOf pasando un caracter como un argumento y un indice
        System.out.println("Última ocurrencia de e en la cadena, con índice <= 15 = " +
                cadena.lastIndexOf('e', 15));
        System.out.println("----------------------------------");

        // lastIndexOf pasando una cadena como argumento
        cadena = "texto repetitivo texto repetitivo";
        System.out.println("Última ocurrencia de la cadena = " +
                cadena.lastIndexOf("texto repetitivo"));
        System.out.println("----------------------------------");

        // lastIndexOf pasando una cadena y un indice como argumento
        cadena = "Java no tiene absolutamente nada que ver con Java Script";
        System.out.println("Última ocurrencia de la cadena, " +
                "con indice <= a la longitud de la cadena - 10 = " +
                cadena.lastIndexOf("Java", cadena.length()-10));

        /* El método valueOf es estático, pertence a la Clase String. No es necesario
        * instanciar un objeto para utilizarlo. Devuelve la representación en string
        * del argumento que se pase. Está sobrecargado.*/
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor booleano
        System.out.println("Representación en String = " + String.valueOf(true));
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor caracter
        System.out.println("Representación en String = " + String.valueOf('c'));
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor double
        System.out.println("Representación en String = " + String.valueOf(1.2d));
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor float
        System.out.println("Representación en String = " + String.valueOf(3.2f));
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor int
        System.out.println("Representación en String = " + String.valueOf(4));
        System.out.println("----------------------------------");

        // valueOf: Representación en cadena de un valor long
        System.out.println("Representación en String = " + String.valueOf(4121321321321L));
        System.out.println("----------------------------------");

        /* El método substring está sobrecargado y devuelve una cadena a partir de
        * un indice de inicio que le indiquemos*/
        System.out.println("Cadena a partir del indice 4 = " + cadena.substring(4));
        System.out.println("----------------------------------");

        // La versión sobrecargada permite indicar un indice final
        System.out.println("Cadena a partir del indice 4 hasta el indice 10 (Los espacios también cuentan) = " +
                cadena.substring(4, 10));
        System.out.println("----------------------------------");

        // El método concat se utiliza para concatenar una cadena al final de la propia cadena
        System.out.println("Resultado = " + cadena.concat(" FIN CADENA"));
        System.out.println("----------------------------------");

        /* El método replace sirve para reemplazar los caracteres de la cadena por el indicado
        * como segundo argumento*/
        System.out.println("Reemplazo a por A = " + cadena.replace('a', 'A'));
        System.out.println("----------------------------------");

        /* El método contains devuelve true o false si la secuencia de caracteres indicada como argumento
        * existe dentro de la cadena en cuestión*/
        System.out.println("Contiene cadena la secuencia de caracteres 'absolutamente' ? = " +
                cadena.contains("absolutamente"));
        System.out.println("----------------------------------");

        /* El método toUpperCase() está sobrecargado y lo que hace es transformar la cadena en
        * mayúsculas. La versión sobrecargada recibe como argumento un objeto de tipo Locale.
        * toLowerCase() transforma la cadena a minuscula*/
        System.out.println("La cadena en mayúsculas es = " + cadena.toUpperCase());
        System.out.println("----------------------------------");

        // El método isEmpty() nos devuelve true si la cadena está vacía
        System.out.println("Está la cadena vacía? = " + cadena.isEmpty());
        System.out.println("----------------------------------");

        /* El método replaceFirst() reemplaza la primera ocurrencia de la cadena
        * con el valor del segundo argumento*/
        System.out.println("Reemplazar la primera ocurrencia de Java = "
                + cadena.replaceFirst("Java", "Python"));
        System.out.println("----------------------------------");

        /* El método replaceAll() reemplaza todas las ocurrencias del primer argumento
        * por la del segundo dentro de la cadena*/
        System.out.println(cadena.replaceAll("Java", "python"));
        System.out.println("----------------------------------");

        // El método trim() elimina todos los espacios extra al principio y al final de la cadena
        cadena = "          Java es un lenguaje multiplataforma            ";
        System.out.println("Antes de trim() = " + cadena);
        System.out.println("Después de trim() = " + cadena.trim());
        System.out.println("----------------------------------");

        /* El método regionMatches() devuelve true si la region de la primera cadena coincide con
        * el de la segunda. Está sobrecargado y permite indicar busqueda sin/con case-sensitive.
        * length se utiliza para devolver la longitud de la cadena*/
        String test = "En web se usa javascript";
        String test1 = "javascript";

        System.out.println("Coinciden las regiones? = " +
                test.regionMatches(test.indexOf("j"), test1, 0, test1.length()-1));
    }
}