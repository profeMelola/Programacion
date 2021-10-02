/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvaloryreferencia;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class PasoPorValoryReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //------------------------------------------------------------------------------
        /*
         * Ejemplo trabajando con parámetros por valor. Tipos simple
         */
        System.out.println("*EJEMPLO DE FUNCIÓN CON PARÁMETROS POR VALOR*");
        int contador = 0;
        System.out.println("[Main] valor de contador antes de llamar a la función:"+contador);
        contador = incrementaContador(contador);
        
        //¿Qué valor tendrá contador?
        System.out.println("[Main] valor de ocntador después de llamar a la función:"+contador);
        
        //------------------------------------------------------------------------------
        
        
        /*
         * Ejemplo trabajando con parámetros por referencia. Tipos complejos, objetos.
         */
        System.out.println("*EJEMPLO DE FUNCIÓN CON PARÁMETROS POR REFERENCIA*");
        // BLOQUE 1:
        //Pedimos escribir un decimal por consola. Al ser el Locale por defecto, habrá que escribirlo con coma
        //Creo un objeto Scanner que no voy a modifar
        Scanner sc1 = new Scanner(System.in);
        
        float decimal = 0.0f;
        System.out.println("Escribe un decimal:");
        if (sc1.hasNextFloat()){
            decimal = sc1.nextFloat();
            System.out.println("Es un decimal usando la coma!");
        }
        else
            System.out.println("No es un decimal porque no usas la coma!");
        
        //BLOQUE 2:
        //Creo un objeto Scanner que sí voy a modificar
        Scanner sc2 = new Scanner(System.in);
        //Modificamos el Locale de Scanner llamando a la función cambiaScanner
        cambiaScanner(sc2);
        
        //Ahora pedimos que escriba otro decimal. Al cambiar a Locale US, el decimal debe ponerse con punto, si se pone con coma fallará
        System.out.println("Escribe otro decimal:");
        if (sc2.hasNextFloat()){
            decimal = sc2.nextFloat();
            System.out.println("Es un decimal usando el punto!");
        }
        else
            System.out.println("No es un decimal porque no usas el punto!");
        //------------------------------------------------------------------------------
        
        // Limpiando scanners al final del programa. Recomendado...
        sc1.close();
        sc2.close();
        
    }

    /**
     * Ejemplo de método o función con paso de parámetros por valor
     * @param contador
     * @return 
     */
    public static int incrementaContador(int contador){
        int contadorAux = contador;
        contador++; //como se pasan los argumentos por valor (una copia) aunque incremente contador, no afecta al contador del método main
        System.out.println("[incrementaContador] contador:"+contador);
        System.out.println("[incrementaContador] contadorAux:"+contadorAux);
        return contadorAux;
    }
    
    /**
     * Ejemplo de método o función con paso de parámetros por referencia (es el mismo objeto, no una copia)
     * @param sc 
     */
    public static void cambiaScanner(Scanner sc){
        sc.useLocale(Locale.US);
        System.out.println("[cambiaScanner] cambiado el Locale a US!!!");
    }
}
