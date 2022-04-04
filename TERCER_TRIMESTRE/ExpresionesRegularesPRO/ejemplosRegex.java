
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author melola
 */
public class ejemplosRegex {

    
    public static void main(String[] args) {
        
        System.out.println("1. Ejecutando contarVocalesConsonantes .....");
        System.out.println("\tCon espacios:");
        contarVocalesConsonantes("MARI LUZ ELOLA RUBIO",false);  // sin quitar espacios en blanco
        System.out.println("\tSin espacios:");
        contarVocalesConsonantes("MARI LUZ ELOLA RUBIO",true); // quitando espacios en blanco
        
        System.out.println("\n2. Ejecutando buscarPatronEtiquetas .....");
        buscarPatronEtiquetas();
        
        System.out.println("\n3. Extraer dirección de email....");
        extraerDireccionEmail();
        
        System.out.println("\n4. Buscar palabra....");
        String text = "This is the text which is to be searched "
        + "for occurrences of the word 'is'.";

        String patternString = "is";
        buscarPalabra(text, patternString);
        
        System.out.println("\n.5 Buscar y sustituir....");
       
        String sustituir = "SI";
        String texto = sustituirPalabra(text,patternString,sustituir);
        System.out.println(texto);
        

    }

    /**
     * contarVocalesConsonantes
     */
    public static void contarVocalesConsonantes(String frase, boolean sinEspacios) {
        int nvocales = 0;
        int consonantes = 0;
        int longi = 0;

        if (sinEspacios)
            frase = frase.replaceAll(" ", "");
        
        longi = frase.length();

        // contar las letras del string
        // construimos el patrón
        Pattern p = Pattern.compile("[AEIOU]");

        // utilizamos los médos de búsqueda 
        Matcher m = p.matcher(frase);
        while (m.find()) {
            System.out.println("Encontrada vocal. Contador<" + nvocales + ">");
            nvocales++;

        }
        consonantes = longi - nvocales; // De esta forma está teniendo en cuenta los espacios en blanco
        
        System.out.println("Tienes " + consonantes + " consonantes y " + nvocales + " vocales ");
        

    }


    /**
     * Este método encuentra los valores de etiquetas XML
     */
    public static void buscarPatronEtiquetas() {
        String cadena = "<a>uno</a><b>dos</b><c>tres</c>";
        Pattern pattern1 = Pattern.compile("<[^>]*>([^<]*)</[^>]*>");
        Matcher matcher1 = pattern1.matcher(cadena);

        for (int i = 0; i < 1; i++) {
            while (matcher1.find()) {
                System.out.println(matcher1.group(1));
            }
        }
    }

    /**
     * extraerDireccionEmail
     */
    public static void extraerDireccionEmail() {
        String entrada = "<p>hola@pedro.com</p><br>\n";
        entrada += "kk@tres.tris///pepe@eso.es";
        
        System.out.println("[extraerDireccionEmail] ENTRADA: "+entrada);

        Pattern limpiar = Pattern
                .compile("([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)");
        Matcher buscar = limpiar.matcher(entrada);
        
        System.out.println("[extraerDireccionEmail] SALIDA:");
        while (buscar.find()) {
            System.out.println(buscar.group(1));
        }
        
    }

    /**
     * Método que busca una palabra en una cadena
     * Indica la ocurrencia y el índice en la frase donde empieza y termina la palabra encontrada
     */
    public static void buscarPalabra(String text, String patternString) {

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }
   /**
    * sustituirPalabra
    * @param text
    * @param patternString
    * @param sustituir
    * @return 
    */
   public static String sustituirPalabra(String text, String patternString, String sustituir) {
       
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        
        StringBuilder sb = new StringBuilder(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            //System.out.println("found: " + count + " : "+ matcher.start() + " - " + matcher.end());
            sb.replace(matcher.start(), matcher.end(), sustituir);
        }
       
       return sb.toString();
       //return text.replaceAll(patternString, sustituir);
       
    }    
    /********************************************************************************************/
    /******************** EXPRESIONES REGULARES CON LA CLASE STRING ****************************/
    public static boolean validaNumeroEntero_Exp(String texto) {

        return texto.matches("^-?[0-9]+$");
    }

    public static boolean validaNumeroEnteroPositivo_Exp(String texto) {

        return texto.matches("^[0-9]+$");
    }

    public static boolean validaDNI_Exp(String DNI) {

        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");

    }

    public static boolean validaHexadecimal_Exp(String hexadecimal) {

        return hexadecimal.matches("^[0-9A-F]+$");

    }
    
}
