package contarvocales;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class ContarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palabra="";
        int contador = 0;
        
        System.out.println("Escribe una palabra:");
        palabra = sc.nextLine();
        
        palabra = palabra.toLowerCase();
        
        for (int i=0; i < palabra.length(); i++){
            char c = palabra.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contador++;
        }
        
        System.out.println("El número de vocales es:"+contador);
    }
    
}
