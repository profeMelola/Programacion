/*
 * Programa que calcula el número de palabras de una frase dada
 */
package contarpalabras;

import java.util.StringTokenizer;

/**
 *
 * @author melol
 */
public class ContarPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Esta es la frase de prueba.";
        int numPalabras = conTokenizer(frase);
        System.out.println("* CON TOKENIZER: "+numPalabras);

        numPalabras = conTokenizerLargo(frase);
        System.out.println("* CON TOKENIZER 2: "+numPalabras);
        
        numPalabras = conIndexOf(frase);
        System.out.println("* CON INDEXOF: "+numPalabras);
        
        numPalabras = conSplit(frase);
        System.out.println("* CON SPLIT: "+numPalabras);
    }
    
    /**
     * conTokenizer
     * @param frase
     * @return 
     */
    public static int conTokenizer(String frase){
        //StringTokenizer st = new StringTokenizer(frase," ");
        StringTokenizer st = new StringTokenizer(frase);
        return st.countTokens();
    }
    
    public static int conTokenizerLargo(String frase){
        StringTokenizer st = new StringTokenizer(frase);
        int cont=0;
        while(st.hasMoreTokens()){
            st.nextToken();
            cont++;
        }
        return cont;
    }
    
    /**
     * conIndexOf
     * @param frase
     * @return 
     */
    public static int conIndexOf(String frase){
        int contador = 1, pos;
        frase = frase.trim(); //eliminar los posibles espacios en blanco al principio y al final
        
        if (frase.isEmpty()) contador = 0;
        else{
            pos = frase.indexOf(" "); //buscamos el primer espacio en blanco
            while (pos != -1){
                contador++;
                pos = frase.indexOf(" ",pos+1); //se busca el siguiente espacio en blanco a continuación del actual
            }
        }
        return contador;
    }
    
    /**
     * El método split(String regex) en Java toma una expresión regular 
     * y rompe la cadena dada que coincide con la expresión regular 
     * y devuelve un array de cadenas.
     */
    private static int conSplit(String frase){
        String[] palabras = frase.split("\\s+"); //Espacio en blanco que aparezca 1 o más veces (http://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html)
        return palabras.length;
    }
}
