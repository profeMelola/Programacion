package pruebasconversiones;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class PruebasConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //---------------------
        // String 2 char[] 
        // char[] 2 String
        //---------------------
        String cadena = "Me gusta programar en Java";
        
        cadena += " mucho";
        
        System.out.println("* cadena:"+cadena);
        
        char[] letras = cadena.toCharArray();
        
        System.out.println("* letras:"+letras);
        
        System.out.println("* letras con for: ");
        for ( int i =0 ; i < letras.length; i++)
            System.out.print(letras[i]);
        System.out.println("\n");
        
        System.out.println("* letras con Arrays.toString(): "+Arrays.toString(letras));
        
        System.out.println("* letras con String.value(): "+String.valueOf(letras));
        
        // -------------
        // String 2 int
        // -------------
        String numero1 = "2021";
        
        String numero2 = "2021";
        
        /* 
        La diferencia es valueOf() devuelve un Integer
        y parseInt() devuelve un int (un tipo primitivo).
        Con el autoboxing la diferencia no es tan notable, 
        aunque es un procesamiento extra que puede ralentizar.
        Si necesitas sólo el tipo nativo, es mejor usar parseInt.
        Si necesitas un objeto, usas valueOF
        */        
        int num1 = Integer.parseInt(numero1); //devuelve un int (tipo primitivo)
        
        Integer num2 = Integer.valueOf(numero2); //devuelve un Integer (clase wrapper) //autoboxing
        
        int suma = num1 + num2;
        
        System.out.println("* Suma:"+suma);
        
        
        
    }
    
}
