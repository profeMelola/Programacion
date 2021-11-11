/*
Realiza un programa que lea de consola una secuencia de números enteros positivos de un dígito introducidos por el usuario hasta que escriba un cero. Si el usuario escribe por consola un número de más de un dígito debe recibir un aviso para que introduzca el número correctamente, pero el programa no debe parar (3 puntos)

Luego debe mostrar por consola tres cosas:

El resultado de sumar todos los números introducidos múltiplos de 3. (2 puntos)
La cantidad de números múltiplos de 3. (2 punto)
Los números introducidos por el usuario en orden inverso. (3 puntos)
*/
package pruebaevaluable1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class PruebaEvaluable1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        int contadorMulti = 0;
        int sumatorio = 0;

        // opción A
        //int[] numeros = new int[100];
        //int i = 0;
        //System.out.println(" El array de enteros al principio:"+Arrays.toString(numeros));
        
        // opción B
        String numeros = "";
        
        do{
            System.out.println("* Introduce un número de un dígito:");
            num = sc.nextInt();
            
            if ( num > 0 && num < 10){
                
                //numeros[i] = num;
                //i++;
                
                numeros += num;
                
                if (esMultiplo(num,3)){
                    contadorMulti++;
                    sumatorio += num;
                }
                
                
            }else if ( num == 0){
                System.out.println("Vas a salir del programa...");
            }else{
                System.out.println("El número debe ser de un dígito, mete otro..");
            }
        }while( num != 0);
        
        System.out.println("* Número de múltiplos de 3:"+contadorMulti);
        System.out.println("* Sumatorio de múltiplos de 3:"+sumatorio);
        //System.out.println(" El array de enteros al final:"+Arrays.toString(numeros));
        System.out.println("* Números introducidos por el usario:"+numeros);
       
        mostrarStringInverso(numeros);
        
    }
    
    public static boolean esMultiplo(int num,int multi){
        if ( num % multi == 0)
            return true;
        else
            return false;
    }
    
    public static void mostrarStringInverso(String numeros){
        System.out.println("* Números introducidos por el usuario en orden inverso");
        for( int i = numeros.length() -1 ; i >= 0; i--){
            System.out.print(numeros.charAt(i));
            
        }
        System.out.println("");
    }
}
