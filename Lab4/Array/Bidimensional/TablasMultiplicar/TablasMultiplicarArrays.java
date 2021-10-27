package tablasmultiplicararrays;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class TablasMultiplicarArrays {

    /**
     * @param args the command line arguments
     */
    static Scanner sc;
    
    public static void main(String[] args) {
        
        sc = new Scanner(System.in); //se inicializa una vez
        
        int opcion = 3;
        
        int[][] tablas = new int[10][11]; //matriz con las tablas de multiplicar
        //independientemente de la opción elegida por el usuario, inicializo los 
        //valores de la matriz de lsa tablas de multiplicar
        Utilidades.cargarTablasMultiplicar(tablas);
        
        do{
            opcion = pintaMenu();
            
            switch(opcion){
                case 1:
                    Utilidades.mostrarTablasMultiplicar(tablas);
                    Utilidades.mostrarTablasMultiplicarMatriz(tablas);
                    break;
                case 2:
                    int numTabla=pideTabla();
                    
                    if (numTabla >=1 || numTabla <=10){
                        Utilidades.mostrarTablaMultiplicar(tablas, numTabla);
                    }else
                        System.out.println("otra cosa");
                    
                    
                    break;
                case 3:
                    System.out.println("Vas a salir del programa...");
                    break;
            }
        }while(opcion!=3);
        
    }
    
    /**
     * 
     * @return 
     */
    public static int pintaMenu(){
        
        System.out.println("\n");
        System.out.println("*MENÚ: Tablas de multiplicar"); 
        System.out.println("* 1. Listar tablas de multiplicar del 1 al 10");
        System.out.println("* 2. Elegir una tabla concreta");
        System.out.println("* 3. Salir");
        
        System.out.println("Elige una opción>>");
        
        return sc.nextInt();
    }
    
    public static int pideTabla(){
        System.out.println("Indica la tabla de multiplicar que quiere ver:");
        return sc.nextInt();
    }
    
}
