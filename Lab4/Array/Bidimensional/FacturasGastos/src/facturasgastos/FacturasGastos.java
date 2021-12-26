/*
 * PROGRAMA QUE CALCULA EL IMPORTE TOTAL DE TODAS LAS FACTURAS Y SUS GASTOS ASOCIADOS
 *
 * REQUISITOS:
 * - Debe pedir el número de facturas del cliente.
 * - Por cada factura debe pedir el número de gastos que tiene la factura.
 * - Debe mostrar el importe total de gastos de cada factura.
 * - Finalmente debe mostrar el importe total de todas las facturas del usuario
 *
 * EJEMPLO DE FACTURAS:
 * Factura número 1:
 *      - Gasto 1: 100 euros
 *      - Gasto 2: 23 euros
 *      - Gasto 3: 12,5 euros
 * Factura número 2:
 *      - Gasto 1: 34,68 euros
 *      - Gasto 2: 2 euros
 *
 *  RESULTADO OBTENIDO POR EL PROGRAMA:
 *      Factura 1, total importe: 135,5 euros
 *      Factura 2, total importe: 36 euros
 *      Importe total: 171,5 euros
 */

package facturasgastos;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author melola
 */
public class FacturasGastos {

    public static String EURO = "\u20ac";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ------------------------------------------------------
        // Declaración de variables a usar en el método main
        int numFacturas = 0;
        int indiceFacturas = 0;
        float importeTotalFacturas = 0.0f; //importe total de todas las facturas
        
        int numGastos = 0;
        int indiceGastos = 0;
        float importeTotalGastos = 0.0f; //importe total de todos los gastos de una factura
        
        // ------------------------------------------------------
        // Lectura del  número de facturas por consola
        System.out.println("** Indica el número de facturas que vas introducir:");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        numFacturas = sc.nextInt();
        
        // --------------------------------------------------
        // Array donde almacenar los gastos de una factura
        float[] gastos = null;
        
        // Array con el número de facturas
        // En cada posición del array se almacenará el array con sus gastos
        // Por ahora no sabemos el número de gastos por factura
        float[][] facturas = new float[numFacturas][];
        
        //----------------------------------------------------
        
        // Primer bucle. Se ejecutará tantas veces como FACTURAS introduzca el usuario
        for (indiceFacturas=1; indiceFacturas <= numFacturas; indiceFacturas++){
            
            //Por cada factura hay que preguntar por los gastos de dicha factura
            System.out.println("* Indica el número de gastos de la factura ("+indiceFacturas+")");
            numGastos = sc.nextInt();
        
            // Array con el número de gastos
            // En cada posición se almacenará el importe de cada gasto            
            gastos = new float[numGastos];
            
            //Segundo bucle. Se ejecutará tantas veces como GASTOS tenga la factura
            //Bucle para inicializar con valores el array de gastos
            for (indiceGastos=1; indiceGastos <= numGastos; indiceGastos++){
                System.out.println("\t Indica el importe del gasto ("+indiceGastos+")");
                float gasto = 0.0f;
                gasto = sc.nextFloat();
                
                //inicializo el array con cada gasto en la posición correspondiente. Empezando por 0
                gastos[indiceGastos - 1] = gasto;
                
            }
            
            // Como el índice del bucle empieza en 1, hay que restar 1 para inicializar en el índice correcto
            facturas[indiceFacturas - 1] = gastos;
            
        }
        
        // LLamada al método estático de la clase Facturas que muestra por pantalla el contenido del array bidimensional
        Facturas.imprimeFacturas(facturas);
        
        // Por cada factura llamo al método estático que devolverá el importe de los gastos de la factura
        int f = 0;
        for (float[] factura:facturas){
            importeTotalGastos = Facturas.obtenerImporteTotalGastosFactura(factura);
            System.out.println("*********************************************************");
            System.out.println("**** Importe total de todos los gastos de la factura ("+(f+1)+") : "+importeTotalGastos);
            System.out.println("*********************************************************");
            
            f++;
        }
        
        // Llamada la método estático que devuelve el importe final de todas las facturas
        importeTotalFacturas = Facturas.obtenerImporteTotalFacturas(facturas);

        System.out.println("*********************************************************");
        System.out.println("**** Importe total de todas las facturas: "+importeTotalFacturas);
        System.out.println("*********************************************************");
        
        
    }
    
    
}