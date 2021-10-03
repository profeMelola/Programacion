/*
 * Escribir el programa que reciba como dato de entrada el valor de una temperatura expresada en grados centígrados 
 * y nos calcule y escriba sus equivalentes en grados Reamhur, grados Fahrenheit y grados Kelvin.

 * Programa: CalcularGrados

 * Entorno:

            CELSIUS, KELVIN, REAMHUR, FARENHEIT son numéricas reales

 * Algoritmo:

        InicioPrograma escribir “Introduzca la temperatura en grados CELSIUS”

        leer CELSIUS

        REAHMUR=CELSIUS *0,8

        FARENHEIT=CELSIUS*1,8 +32

        KELVIN=CELSIUS + 273

        escribir REAMHUR, FARENHEIT, KELVIN

        FinPrograma
 */
package convertirgradostemperatura;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalcularGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius, kelvin, reamhur, farenheit;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe los grados centígrados:");
        celsius = lector.nextDouble();
        
        reamhur = celsius * 0.8;
        farenheit = celsius * 1.8 + 32;
        kelvin = celsius +273;
        
        System.out.println("Grados Reamhur: "+reamhur);
        System.out.println("Grados Kelvin: "+kelvin);
        System.out.println("Grados Farenheit: "+farenheit);
        
    }
    
}
