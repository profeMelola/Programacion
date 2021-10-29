package ejercicio4clase;

import java.util.Arrays;

/**

 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego

 * introducirá en el primer array todos los valores del 1 al 100. Por último,

 * deberá copiar todos los valores del primer array al segundo array en orden

 * inverso, y mostrar ambos por pantalla.

 */

public class Ejercicio4Clase {


    public static void main(String[] args) {

        int length = 100;

        int v1[] = new int[length];

        int v2[] = new int[length];
        
        int v3[] = new int[length];

        /*v1[0] = 1;
        v1[1] = 2;
        v1[2] = 3;
        v1[99] = 100;*/

        // V1: Valores del 1 al 100
        for (int i = 0; i < v1.length; i++){
            v1[i] = i + 1;
            //System.out.print(v1[i] + " ");
        }
        
        //System.out.println(v1); //esto muestra una posición de memoria
        pintaArray(v1);
        
        System.out.println("Otra forma de pintar el contenido de un array:");
        System.out.println(Arrays.toString(v1));
        
        //copiando el contenido del array 1 en el array 2
        for (int i=0; i<v1.length;i++)
            v2[i] = v1[i];
        
        System.out.println("Array 2::::::");
        pintaArray(v2);
        
        System.out.println("\n");
        
        /*System.out.println("Directamente...");
        //-------------------------------------------
        for(int i=v1.length - 1; i >= 0 ; i--)
            v2[i] = i+1;
        
        pintaArray(v2);*/
                    
        //-------------------------------------
        // COPIAR
        //copiando el contenido del array 1 en el array 2 de forma inversa
        for(int i=0; i< v1.length;i++){
            v2[i] = v1[v1.length - i - 1];
        }
        System.out.println("Al revés 1");
        pintaArray(v2);

        //copiando el contenido del array 1 en el array 2 de forma inversa
        int j = 0; //índice para el array v2
        for(int i=v1.length - 1; i >= 0; i--){
            v3[j] = v1[i];
            j++;
        }
        System.out.println("\n");
        System.out.println("Al revés 2");
        pintaArray(v3);
        //---------------------------------------
        
        
    }


    public static void pintaArray(int[] v){
        System.out.println("\n");
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        
    }
}