
/*
 * Solución al reto 3 y 4 pero separando la lógica en dos nuevas funciones:
 * obtenerPrecioConDescuento y obtenerNumOperaciones
 */
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melola
 */
public class BilletesTrenRet3Funcion {
    
    static final int PRECIO_BILLETE = 2; //constante con el precio del billete sin descuento
    static final int LIMITE_OPERACIONES = 10;
    
    /**
     * MAIN
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("* BILLETES TREN RETO 3 CON FUNCIONES MÉTODOS!!!!");
        
        // --------------------------------------
        // Declarando variables
        int edad = 0;
        int precioFinalBillete = 0;
        
        int precioTotalBilletes = 0; //precio de los billetes de un usuario
        int numBilletes = 0;

        int contador = 1;
        int numOperaciones = 0; //numero de veces que se ejecuta la maq expendedoraa

        Scanner sc = new Scanner(System.in);
        
        int dineroRecaudado = 0;
        // --------------------------------------
        
        //--------------------------------------------------------------
        // Pidiendo el número de operaciones y controlando que sea mayor que cero
        //-------------------------------------------------
        numOperaciones = obtenerNumOperaciones(sc);
        
        //---------------------------------------------------------------------
        // Buble de la máquina expendora
        while (contador <= numOperaciones) {

            System.out.println("***************************");
            System.out.println("*Operación número <" + contador+">");
            
            //Pedir el número de billetes
            System.out.print("Introduce el número de billetes que quieres comprar: ");
            numBilletes = sc.nextInt();            
            
            //bucle para recorrer el número de billetes
            for (int i=1;i<=numBilletes;i++){
            //Pedir la edad al usuario
                System.out.print("Billete número ("+i+")");
                System.out.print("Introduce tu edad: ");
                edad = sc.nextInt();
                precioFinalBillete = obtenerPrecioConDescuento(edad);
                System.out.println("El precio del billete es: " + precioFinalBillete);
                //precioTotalBilletes = precioTotalBilletes + precioFinalBillete;
                precioTotalBilletes += precioFinalBillete;
                
            }//end for
            
            System.out.println("El precio total de los billetes: " + precioTotalBilletes);
            dineroRecaudado += precioTotalBilletes;
            precioTotalBilletes = 0;
            System.out.println("***************************");
            contador++;
        }
        //--------------------------------
        
        System.out.println("[FIN] EL PRECIO TOTAL RECAUDADO: " + dineroRecaudado);
    }

    /**
     * obtenerNumOperaciones
     * @param sc Lector
     * @return 
     */
    public static int obtenerNumOperaciones(Scanner sc){
        int numOperaciones=0;
        do {
            System.out.println("[INIT] \nIntroduce cuantas veces se va a ejecutar la máquina expendedora:");
            //if (sc.hasNextInt()){
                numOperaciones = sc.nextInt();

                if (numOperaciones < 0 || numOperaciones > LIMITE_OPERACIONES) {
                    System.out.println("El número de operaciones tiene que ser mayor qwue cero y menor que "+LIMITE_OPERACIONES);
                }
            //}
        } while (numOperaciones <= 0);
        
        return numOperaciones;
    }
    
    /**
     * obtenerPrecioConDescuento
     * @param edad  
     * @return precio final billete
     */
    public static int obtenerPrecioConDescuento(int edad){
        int precioFinalBillete = 0;
        
        //Comprobando condiciones para aplicar precio final al billete
        if (edad < 8) {
            precioFinalBillete = 0;
        } else if (edad >= 8 && edad <= 17) {
            precioFinalBillete = PRECIO_BILLETE / 2;
        } else if (edad >= 18 && edad <= 64) {
            precioFinalBillete = PRECIO_BILLETE;
        } else if (edad > 64) {
            precioFinalBillete = 0;
        }
        
        return precioFinalBillete;
    }
            
}
