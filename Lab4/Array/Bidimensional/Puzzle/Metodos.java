package puzzle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Metodos {

    /**
     * devuelveTabla
     * @param palabras
     * @return 
     */
    public static char[][] devuelveTabla(String[] palabras){
        
        //se supone que nos envían todas las palabras de la misma logintud
        int filas = palabras.length; // 5 filas
        int col = palabras[0].length(); // 5 columnas
        
        char[][] tabla = new char[filas][col];
        char[] palabraChar;
        
        for(int i = 0; i < filas; i++){
            palabraChar = palabras[i].toCharArray();
            for(int j=0; j < col; j++){
                tabla[i][j] = palabraChar[j];
            }
        }
              
        return tabla;
    }
    
    /**
     * copiarTabla
     * @param tabla
     * @return 
     */
    public static char[][] copiarTabla(char[][] tabla){
        char[][] copia = new char[tabla.length][tabla[0].length];
        
        /*for(int fila=0;fila < tabla.length;fila++){
            for(int col=0; col <tabla[0].length; col++){
                copia[fila][col] = tabla[fila][col];
            }
        }*/
        
        copia = tabla.clone();
        
        return copia;
        
    }
    
    public static char[][] devuelveTablaModifica(char[][] tabla){
        char[][] copia;
        //1. copiar tabla original para poderla modificar sin tocar la original
        copia = copiarTabla(tabla);
        
        Random rd = new Random();
        int r1,r2;
        
        int filas = tabla.length;
        int col = tabla[0].length;
        
        for(int i=0; i< filas; i++){
            r1 = rd.nextInt(filas);
            do{
                r2 = rd.nextInt(filas);
            }while( r1 == r2 );
            
            //intercambiar las posiciones de las filas de cada columna
            intercambiaPosiciones(copia,i,r1,r2);
        }
        return copia;
        
    }
    
    /**
     * 
     * @param tabla
     * @param col
     * @param pos1
     * @param pos2 
     */
    public static void intercambiaPosiciones(char tabla[][],int col, int pos1, int pos2){
        char aux = tabla[pos1][col];
        tabla[pos1][col] = tabla[pos2][col];
        tabla[pos2][col] = aux;
        
    }
    
    /**
     * 
     * @param tabla 
     */
    public static void mostrarTabla(char[][] tabla){
        System.out.println("  " + "1 2 3 4 5");
        System.out.println("  " + "---------\n");

        for(int fila = 0; fila < tabla.length; fila++){
            System.out.print( (fila + 1) + "|");
            for(int col=0; col < tabla[0].length;col++){
                System.out.print(" "+tabla[fila][col]);
            }
            System.out.println("\n");
        }
    }
    
    /**
     * pedirPosiciones
     * @param max1
     * @param max2
     * @return 
     */
    public static int[] pedirPosiciones(int max1, int max2){
        Scanner sc = new Scanner(System.in);
        int[] posiciones = new int[3];
        
        do{
            System.out.println("* Introduce la columna que quiere cambiar: ");
            posiciones[0] = sc.nextInt() - 1 ;
        }while( posiciones[0] < 0 || posiciones[0] >=  max1);
        do{
            System.out.println("* Introduce la primera posición que quiere intercambiar: ");
            posiciones[1] = sc.nextInt() - 1;
        }while( posiciones[1] < 0 || posiciones[1] >=  max1);
        do{
            System.out.println("* Introduce la segunda posición que quiere intercambiar: ");
            posiciones[1] = sc.nextInt() - 1;
        }while( posiciones[2] < 0 || posiciones[2] >=  max1);
        
        return posiciones;
    }
    
    /**
     * intercambiarPosiciones
     * @param tabla
     * @param col
     * @param pos1
     * @param pos2 
     */
    public static void intercambiaPosiciones(char tabla[][],int pos[]){
        char aux;
        
        aux = tabla[pos[1]][pos[0]];
        tabla[pos[1]][pos[0]] = tabla[pos[2]][pos[0]];
        tabla[pos[2]][pos[0]] = aux;
        
        
        
    }
    
    
    public static boolean compararTablas(char tabla[][], char copia[][]){
        
        for(int fila=0; fila < tabla.length; fila++){
            for(int col =0; col < tabla[0].length; col++){
                if (copia[fila][col] != tabla[fila][col])
                    return false;
            }
        }
        
        return true;
        
    }
}
