/*
  - Realiza un programa que lea de consola una secuencia de números enteros 
    no nulos hasta que se introduce un número negativo.
  - Luego debe mostrar por consola dos cosas:
         - el resultado de sumar todos los números introducidos positivos.
         - la cantidad de números de dos dígitos que se han introducido (pista: de 10 a 99)
 */
package pruebacontrol1;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class PruebaControl1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sumatorioPositivos = 0;
        int num2Dig = 0;
        int num = 0;
        
        while ( num >= 0){
            System.out.println("Introduce un número entero:");
            num = sc.nextInt();
            
            // 1. sumatorio de positivos (acumulador)
            if ( num >= 0){
                //sumatorioPositivos = sumatorioPositivos + num;
                sumatorioPositivos += num;
            }
            
            // 2. cantidad de números de dos dígitos (contadores)
            if ( num >= 10 && num <= 99){
                num2Dig++;
            }
        }
        
        System.out.println("* El sumatorio de los números positivos es:"+sumatorioPositivos);
        System.out.println("* La cantidad de números de dos dígitos es:"+num2Dig);
        
    }
    
}
