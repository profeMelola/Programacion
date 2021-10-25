class DemoMetodosString
{
    public static void main (String[] args)
    {
        String s= "JavadesdeCero";
        // o String s= new String ("JavadesdeCero");

        // Devuelve la cantidad de caracteres en la Cadena.
        System.out.println("String length = " + s.length());

        // Devuelve el carácter en el índice i.
        System.out.println("Character at 3rd position = "
                + s.charAt(3));

        // Devuelve la subcadena del carácter índice i-ésimo
        // al final de la cadena
        System.out.println("Substring " + s.substring(3));

        // Devuelve la subcadena del índice i a j-1.
        System.out.println("Substring  = " + s.substring(2,5));

        // Concatena string2 hasta el final de string1.
        String s1 = "Java";
        String s2 = "desdeCero";
        System.out.println("String concatenado  = " +
                s1.concat(s2));

        // Devuelve el índice dentro de la cadena de
        // la primera aparición de la cadena especificada.
        String s4 = "Java desde Cero";
        System.out.println("Índice de Cero: " +
                s4.indexOf("Cero"));

        // Devuelve el índice dentro de la cadena de
        // la primera aparición de la cadena especificada,
        // comenzando en el índice especificado.
        System.out.println("Índice de a  = " +
                s4.indexOf('a',3));

        // Comprobando la igualdad de cadenas
        Boolean out = "Java".equals("java");
        System.out.println("Comprobando la igualdad: " + out);
        out = "Java".equals("Java");
        System.out.println("Comprobando la igualdad: " + out);

        out = "Java".equalsIgnoreCase("jaVA ");
        System.out.println("Comprobando la igualdad: " + out);

        int out1 = s1.compareTo(s2);
        System.out.println("Si s1 = s2: " + out);

        // Conversión de cases
        String palabra1 = "JavadesdeCero";
        System.out.println("Cambiando a minúsculas: " +
                palabra1.toLowerCase());

        // Conversión de cases
        String palabra2 = "JavadesdeCero";
        System.out.println("Cambiando a MAYÚSCULAS: " +
                palabra1.toUpperCase());

        // Recortando la palabra
        String word4 = " JavadesdeCero ";
        System.out.println("Recortando la palabra: " + word4.trim());

        // Reemplazar caracteres
        String str1 = "YavadesdeCero";
        System.out.println("String Original: " + str1);
        String str2 = "YavadesdeCero".replace('Y' ,'J') ;
        System.out.println("Reemplazando Y por J -&gt; " + str2);
    }
}
