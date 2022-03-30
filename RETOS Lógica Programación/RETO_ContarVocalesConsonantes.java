/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto_contarvocalesconsonantes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author melol
 */
public class RETO_ContarVocalesConsonantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contarVocalesConsonantes("Mi frase de prueba",true);
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
        
        frase = frase.toUpperCase();
        
        longi = frase.length();

        // contar las letras del string
        // construimos el patrón
        Pattern p = Pattern.compile("[AEIOU]");

        // utilizamos los médos de búsqueda 
        Matcher m = p.matcher(frase);
        while (m.find()) {
            //System.out.println("Encontrada vocal. Contador<" + nvocales + ">");
            nvocales++;

        }
        consonantes = longi - nvocales;
        
        System.out.println("Tienes " + consonantes + " consonantes y " + nvocales + " vocales ");
        

    }    
}
